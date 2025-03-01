import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class ejercicio5 extends JFrame {
    private JTextField campoNombre, campoSalario, campoHoras;
    private JComboBox<String> comboDepartamento;
    private JTextArea areaResultado;
    private JButton botonCalcular, botonLimpiar;

    private final String[] DEPARTAMENTOS = {"Gerencia", "Auditoría", "Tecnología", "Contabilidad"};
    private final double[] TASAS_BONO = {3.50, 1.75, 2.25, 2.00};

    public ejercicio5() {
        setTitle("Calculadora de Pago de Horas Extras");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel panelEntrada = new JPanel(new GridLayout(4, 2, 10, 10));
        panelEntrada.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelEntrada.add(new JLabel("Nombre:"));
        campoNombre = new JTextField();
        panelEntrada.add(campoNombre);

        panelEntrada.add(new JLabel("Salario:"));
        campoSalario = new JTextField();
        panelEntrada.add(campoSalario);

        panelEntrada.add(new JLabel("Departamento:"));
        comboDepartamento = new JComboBox<>(DEPARTAMENTOS);
        panelEntrada.add(comboDepartamento);

        panelEntrada.add(new JLabel("Horas realizadas (máx 20):"));
        campoHoras = new JTextField();
        panelEntrada.add(campoHoras);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        botonCalcular = new JButton("Calcular");
        botonLimpiar = new JButton("Limpiar");
        panelBotones.add(botonCalcular);
        panelBotones.add(botonLimpiar);

        // Área de resultados
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        JScrollPane panelDesplazamiento = new JScrollPane(areaResultado);

        add(panelEntrada, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(panelDesplazamiento, BorderLayout.SOUTH);

        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPagoHorasExtras();
            }
        });

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoNombre.setText("");
                campoSalario.setText("");
                campoHoras.setText("");
                comboDepartamento.setSelectedIndex(0);
                areaResultado.setText("");
            }
        });
    }

    private void calcularPagoHorasExtras() {
        try {
            // Obtener valores de entrada
            String nombre = campoNombre.getText().trim();
            double salario = Double.parseDouble(campoSalario.getText().trim());
            int indiceDepartamento = comboDepartamento.getSelectedIndex();
            int horasRealizadas = Integer.parseInt(campoHoras.getText().trim());

            // Validar entradas
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un nombre", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (salario <= 0) {
                JOptionPane.showMessageDialog(this, "El salario debe ser mayor que cero", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (horasRealizadas <= 0) {
                JOptionPane.showMessageDialog(this, "Las horas realizadas deben ser mayores que cero", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Aplicar límite máximo de horas
            if (horasRealizadas > 20) {
                JOptionPane.showMessageDialog(this, "Máximo 20 horas extras permitidas. Limitando a 20 horas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                horasRealizadas = 20;
                campoHoras.setText("20");
            }

            // Obtener departamento y tasa de bono
            String departamento = DEPARTAMENTOS[indiceDepartamento];
            double bonoPorHora = TASAS_BONO[indiceDepartamento];

            // Calcular pago de horas extras
            double tarifaDiaria = salario / 30;
            double pagoHorasExtras = (tarifaDiaria * horasRealizadas) + (bonoPorHora * horasRealizadas);

            // Formatear resultado
            DecimalFormat df = new DecimalFormat("#,##0.00");

            // Mostrar resultados
            StringBuilder resultado = new StringBuilder();
            resultado.append("=== PAGO DE HORAS EXTRAS DEL EMPLEADO ===\n");
            resultado.append("Nombre: ").append(nombre).append("\n");
            resultado.append("Salario: $").append(df.format(salario)).append("\n");
            resultado.append("Departamento: ").append(departamento).append("\n");
            resultado.append("Horas realizadas: ").append(horasRealizadas).append("\n");
            resultado.append("Bono por hora: $").append(df.format(bonoPorHora)).append("\n");
            resultado.append("Pago total de horas extras: $").append(df.format(pagoHorasExtras)).append("\n");
            resultado.append("==========================================\n");

            areaResultado.setText(resultado.toString());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores numéricos válidos para salario y horas", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ejercicio5().setVisible(true);
            }
        });
    }
}
