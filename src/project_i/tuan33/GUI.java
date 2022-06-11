package project_i.tuan33;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import java.util.List;

public class GUI extends JFrame {


    private final QuanLySach qls = new QuanLySach();


    private JButton btnThem;
    private JButton btnXoa;
    private JButton btnCapNhat;
    private JButton btnLamMoi;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JComboBox<String> jcbBangTL;
    private JComboBox<String> jcbLoaiTL;
    private JLabel jlbChung1;
    private JLabel jlbChung2;
    private JLabel jlbInfo;
    private JLabel jlbLoai;
    private JLabel jlbMaTL;
    private JLabel jlbNXB;
    private JLabel jlbSlg;
    private JPanel jplChung;
    private JPanel jplInput;
    private JPanel jplLuaChon;
    private JPanel jplOutput;
    private JTable jtbl;
    private JTextField txtChung1;
    private JTextField txtChung2;
    private JTextField txtMaTL;
    private JTextField txtNXB;
    private JTextField txtSB;

    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        loadTable(0);
        jtbl.setAutoCreateRowSorter(true);
        jlbChung1.setVisible(false);
        txtChung1.setVisible(false);
        jlbChung2.setVisible(false);
        txtChung2.setVisible(false);
    }

    public static void main(String[] args) {
        System.out.println("Sinh viên: Vũ Trọng Quảng - 20198270");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    private void loadTable(int type) {

        DefaultTableModel dtm = new DefaultTableModel() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        List<TaiLieu> dsTL = qls.getDsTaiLieu();

        if (type == 0) {

            String[] col = new String[]{"Mã tài liệu", "Nhà xuất bản", "Số bản phát hành", "Tác giả", "Số trang"};
            dtm.setColumnIdentifiers(col);
            jtbl.setModel(dtm);
            dtm.setRowCount(0);

            for (TaiLieu tl : dsTL) {
                if (tl.loaiTaiLieu().equals("SACH")) {
                    Sach s = (Sach) tl;
                    dtm.addRow(new Object[]{s.getMaTaiLieu(), s.getTenNXB(), s.getSoBanPhatHanh(), s.getTenTG(), s.getSoTrang()});
                }
            }
        } else if (type == 1) {

            String[] col = new String[]{"Mã tài liệu", "Nhà xuất bản", "Số bản phát hành", "Số phát hành", "Tháng phát hành"};
            dtm.setColumnIdentifiers(col);
            jtbl.setModel(dtm);
            dtm.setRowCount(0);

            for (TaiLieu tl : dsTL) {
                if (tl.loaiTaiLieu().equals("TAP_CHI")) {
                    TapChi tc = (TapChi) tl;
                    dtm.addRow(new Object[]{tc.getMaTaiLieu(), tc.getTenNXB(), tc.getSoBanPhatHanh(), tc.getSoPhatHanh(), tc.getThangPhatHanh()});
                }
            }
        } else {

            String[] col = new String[]{"Mã tài liệu", "Nhà xuất bản", "Số bản phát hành", "Ngày phát hành"};
            dtm.setColumnIdentifiers(col);
            jtbl.setModel(dtm);
            dtm.setRowCount(0);

            for (TaiLieu tl : dsTL) {
                if (tl.loaiTaiLieu().equals("BAO")) {
                    Bao b = (Bao) tl;
                    dtm.addRow(new Object[]{b.getMaTaiLieu(), b.getTenNXB(), b.getSoBanPhatHanh(), b.getNgayPhatHanh()});
                }
            }
        }


        setCellsAlignment(jtbl);
    }

    private void initComponents() {

        jplInput = new JPanel();
        jlbInfo = new JLabel();
        jSeparator1 = new JSeparator();
        jlbMaTL = new JLabel();
        jlbNXB = new JLabel();
        jlbSlg = new JLabel();
        jlbLoai = new JLabel();
        txtMaTL = new JTextField();
        txtNXB = new JTextField();
        txtSB = new JTextField();
        jcbLoaiTL = new JComboBox<>();
        jplChung = new JPanel();
        jlbChung1 = new JLabel();
        jlbChung2 = new JLabel();
        txtChung1 = new JTextField();
        txtChung2 = new JTextField();
        btnThem = new JButton();
        btnXoa = new JButton();
        btnCapNhat = new JButton();
        btnLamMoi = new JButton();
        jplOutput = new JPanel();
        jplLuaChon = new JPanel();
        jcbBangTL = new JComboBox<>();
        jScrollPane1 = new JScrollPane();
        jtbl = new JTable();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setTitle("QUẢN LÝ TÀI LIỆU --- Vũ Trọng Quảng --- 20198256");

        jlbInfo.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jlbInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlbInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbInfo.setText("THÔNG TIN TÀI LIỆU");

        jlbMaTL.setHorizontalAlignment(SwingConstants.CENTER);
        jlbMaTL.setText("Mã TL");

        jlbNXB.setHorizontalAlignment(SwingConstants.CENTER);
        jlbNXB.setText("Nhà XB");

        jlbSlg.setHorizontalAlignment(SwingConstants.CENTER);
        jlbSlg.setText("Số bản");

        jlbLoai.setHorizontalAlignment(SwingConstants.CENTER);
        jlbLoai.setText("Loại TL");

        txtMaTL.setBackground(new java.awt.Color(238, 238, 238));
        txtMaTL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        txtNXB.setBackground(new java.awt.Color(238, 238, 238));
        txtNXB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        txtSB.setBackground(new java.awt.Color(238, 238, 238));
        txtSB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jcbLoaiTL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Loại tài liệu", "Sách", "Tạp chí", "Báo"}));
        jcbLoaiTL.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbLoaiTLItemStateChanged(evt);
            }
        });

        jlbChung1.setHorizontalAlignment(SwingConstants.CENTER);

        jlbChung2.setHorizontalAlignment(SwingConstants.CENTER);

        txtChung1.setBackground(new java.awt.Color(238, 238, 238));
        txtChung1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        txtChung2.setBackground(new java.awt.Color(238, 238, 238));
        txtChung2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jplChungLayout = new javax.swing.GroupLayout(jplChung);
         jplChung.setLayout(jplChungLayout);
        jplChungLayout.setHorizontalGroup(
            jplChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplChungLayout.createSequentialGroup()
                .addGroup(jplChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbChung1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jlbChung2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtChung2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChung1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jplChungLayout.setVerticalGroup(
            jplChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplChungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbChung1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChung1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jplChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChung2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbChung2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
         btnThem.setBackground(new java.awt.Color(238, 238, 238));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

      btnXoa.setBackground(new java.awt.Color(238, 238, 238));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(238, 238, 238));
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(238, 238, 238));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });


        GroupLayout jplInputLayout = new GroupLayout(jplInput);
        jplInput.setLayout(jplInputLayout);
       jplInputLayout.setHorizontalGroup(
            jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jplInputLayout.createSequentialGroup()
                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplInputLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplInputLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplInputLayout.createSequentialGroup()
                                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlbLoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbMaTL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbNXB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaTL)
                                    .addComponent(txtNXB)
                                    .addComponent(jcbLoaiTL, 0, 227, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplInputLayout.createSequentialGroup()
                                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jplInputLayout.createSequentialGroup()
                                .addComponent(jlbSlg, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSB))
                            .addComponent(jplChung, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jplInputLayout.setVerticalGroup(
            jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplInputLayout.createSequentialGroup()
                .addComponent(jlbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaTL, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jlbMaTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNXB)
                    .addComponent(jlbNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSB)
                    .addComponent(jlbSlg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbLoaiTL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jplChung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jplInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );        jcbBangTL.setModel(new DefaultComboBoxModel<>(new String[]{"Sách", "Tạp chí", "Báo"}));
        jcbBangTL.setBorder(null);
        jcbBangTL.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbBangTLItemStateChanged(evt);
            }
        });

        GroupLayout jplLuaChonLayout = new GroupLayout(jplLuaChon);
         jplLuaChon.setLayout(jplLuaChonLayout);
        jplLuaChonLayout.setHorizontalGroup(
            jplLuaChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplLuaChonLayout.createSequentialGroup()
                .addComponent(jcbBangTL, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(634, Short.MAX_VALUE))
        );
        jplLuaChonLayout.setVerticalGroup(
            jplLuaChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcbBangTL, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );


        jtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl);

        GroupLayout jplOutputLayout = new GroupLayout(jplOutput);
        jplOutput.setLayout(jplOutputLayout);
        jplOutputLayout.setHorizontalGroup(jplOutputLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jplLuaChon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jScrollPane1));
        jplOutputLayout.setVerticalGroup(jplOutputLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jplOutputLayout.createSequentialGroup().addComponent(jplLuaChon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(0, 0, 0).addComponent(jScrollPane1)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jplInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(2, 2, 2).addComponent(jplOutput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jplInput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jplOutput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }


    private void jcbLoaiTLItemStateChanged(java.awt.event.ItemEvent evt) {

        if (jcbLoaiTL.getSelectedIndex() == 1) {
            jlbChung1.setText("Tác giả");
            txtChung1.setVisible(true);
            jlbChung2.setVisible(true);
            jlbChung2.setText("Số trang");
            txtChung2.setVisible(true);

        } else if (jcbLoaiTL.getSelectedIndex() == 2) {
            jlbChung1.setVisible(true);
            jlbChung1.setText("Số");
            txtChung1.setVisible(true);
            jlbChung2.setVisible(true);
            jlbChung2.setText("Tháng");
            txtChung2.setVisible(true);
        } else if (jcbLoaiTL.getSelectedIndex() == 3) {
            jlbChung1.setVisible(true);
            jlbChung1.setText("Ngày");
            txtChung1.setVisible(true);
            jlbChung2.setVisible(false);
            txtChung2.setVisible(false);
        } else {
            jlbChung1.setVisible(false);
            txtChung1.setVisible(false);
            jlbChung2.setVisible(false);
            txtChung2.setVisible(false);
        }
    }


    private void jcbBangTLItemStateChanged(java.awt.event.ItemEvent evt) {
        int index = jcbBangTL.getSelectedIndex();
        loadTable(index);
    }


    private void jtblMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel dtm = (DefaultTableModel) jtbl.getModel();

        int index = jtbl.convertRowIndexToModel(jtbl.getSelectedRow());

        if (index != - 1) {
            txtMaTL.setText(jtbl.getModel().getValueAt(index, 0).toString());
            txtNXB.setText(jtbl.getModel().getValueAt(index, 1).toString());
            txtSB.setText(jtbl.getModel().getValueAt(index, 2).toString());
            jcbLoaiTL.setSelectedIndex(jcbBangTL.getSelectedIndex() + 1);
            txtChung1.setText(jtbl.getModel().getValueAt(index, 3).toString());
            if (jcbLoaiTL.getSelectedIndex() != 3) {
                txtChung2.setText(jtbl.getModel().getValueAt(index, 4).toString());
            }
        }
    }


    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {

        if (isNull()) {
            JOptionPane.showMessageDialog(this, "Điền đầy đủ thông tin !!!", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String maTL = txtMaTL.getText().trim();
        String nxb = txtNXB.getText().trim();
        int soBan;
        try {
            soBan = Integer.parseInt(txtSB.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số bản phát hành không hợp lệ !!!", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        switch (jcbLoaiTL.getSelectedIndex()) {
            case 1 -> {
                String tenTG = txtChung1.getText().trim();
                int soTrang;
                try {
                    soTrang = Integer.parseInt(txtChung2.getText().trim());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Số trang không hợp lệ !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if (!qls.themTaiLieu(new Sach(maTL, nxb, soBan, tenTG, soTrang))) {
                    JOptionPane.showMessageDialog(null, "Mã tài liệu đã tồn tại !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            case 2 -> {
                int soPhatHanh;
                try {
                    soPhatHanh = Integer.parseInt(txtChung1.getText().trim());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Số phát hành hợp lệ !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                String thangPhatHanh = txtChung2.getText().trim();

                if (!qls.themTaiLieu(new TapChi(maTL, nxb, soBan, soPhatHanh, thangPhatHanh))) {
                    JOptionPane.showMessageDialog(null, "Mã tài liệu đã tồn tại !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            case 3 -> {
                String ngayPhatHanh = txtChung1.getText().trim();

                if (!qls.themTaiLieu(new Bao(maTL, nxb, soBan, ngayPhatHanh))) {
                    JOptionPane.showMessageDialog(null, "Mã tài liệu đã tồn tại !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

            }
        }

        if (jcbLoaiTL.getSelectedIndex() - 1 == jcbBangTL.getSelectedIndex()) {
            loadTable(jcbBangTL.getSelectedIndex());
        } else {
            jcbBangTL.setSelectedIndex(jcbLoaiTL.getSelectedIndex() - 1);
        }
        reset();
    }


    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel dtm = (DefaultTableModel) jtbl.getModel();

        if (jtbl.getSelectedRow() == - 1) {
            JOptionPane.showMessageDialog(this, "Chọn phòng để xóa", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int index = jtbl.convertRowIndexToModel(jtbl.getSelectedRow());

        qls.xoaTaiLieu(jtbl.getModel().getValueAt(index, 0).toString());

        loadTable(jcbLoaiTL.getSelectedIndex() - 1);
        reset();
    }


    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel dtm = (DefaultTableModel) jtbl.getModel();

        if (jtbl.getSelectedRow() == - 1) {
            JOptionPane.showMessageDialog(this, "Chọn phòng để cập nhật", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int index = jtbl.convertRowIndexToModel(jtbl.getSelectedRow());

        String maTLCu = jtbl.getModel().getValueAt(index, 0).toString();
        String maTL = txtMaTL.getText().trim();
        String nxb = txtNXB.getText().trim();
        int soBan;
        try {
            soBan = Integer.parseInt(txtSB.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số bản phát hành không hợp lệ !!!", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        switch (jcbLoaiTL.getSelectedIndex()) {
            case 1 -> {
                String tenTG = txtChung1.getText().trim();
                int soTrang;
                try {
                    soTrang = Integer.parseInt(txtChung2.getText().trim());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Số trang không hợp lệ !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if (!qls.capNhatTaiLieu(maTLCu, new Sach(maTL, nxb, soBan, tenTG, soTrang))) {
                    JOptionPane.showMessageDialog(null, "Mã tài liệu đã tồn tại !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            case 2 -> {
                int soPhatHanh;
                try {
                    soPhatHanh = Integer.parseInt(txtChung1.getText().trim());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Số phát hành hợp lệ !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                String thangPhatHanh = txtChung2.getText().trim();

                if (!qls.capNhatTaiLieu(maTLCu, new TapChi(maTL, nxb, soBan, soPhatHanh, thangPhatHanh))) {
                    JOptionPane.showMessageDialog(null, "Mã tài liệu đã tồn tại !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            case 3 -> {
                String ngayPhatHanh = txtChung1.getText().trim();

                if (!qls.capNhatTaiLieu(maTLCu, new Bao(maTL, nxb, soBan, ngayPhatHanh))) {
                    JOptionPane.showMessageDialog(null, "Mã tài liệu đã tồn tại !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

            }
        }
        if (jcbLoaiTL.getSelectedIndex() - 1 == jcbBangTL.getSelectedIndex()) {
            loadTable(jcbBangTL.getSelectedIndex());
        } else {
            jcbBangTL.setSelectedIndex(jcbLoaiTL.getSelectedIndex() - 1);
        }
        reset();
    }


    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        reset();
    }


    private void reset() {
        txtMaTL.setText("");
        txtNXB.setText("");
        txtSB.setText("");
        jcbLoaiTL.setSelectedIndex(0);
        jlbChung1.setVisible(false);
        txtChung1.setVisible(false);
        txtChung1.setText("");
        jlbChung2.setVisible(false);
        txtChung2.setVisible(false);
        txtChung2.setText("");
    }


    private boolean isNull() {
        if (jcbLoaiTL.getSelectedIndex() == 0) {
            return true;
        }
        return txtMaTL.getText().equals("") && txtNXB.getText().equals("") && txtSB.getText().equals("");
    }


    private void setCellsAlignment(JTable table) {

        TableCellRenderer rendererFromHeader = table.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);


        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }


        table.setRowHeight(20);
    }

}
