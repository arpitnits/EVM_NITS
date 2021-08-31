/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOADER;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class BALLOT_CANDIDATES extends javax.swing.JFrame {

    /**
     * Creates new form BALLOT_CANDIDATES
     */
    
    
    //Global Variables declaration...............
    //Getting the posts from Votes Class..
    Votes v=new Votes();
    String forpost[]=v.read().split(",");
    
    
    
    
    String candidate[]={"AMRIT", "ANKIT", "TARUN", "ARPIT", "OJASVEE"};
    //String forpost[]={"Vice President", "Secretary(Technical)", "Secretary(Cultural)"};
    int posChoice[]=new int[forpost.length];
    int ind=0;
    
    Candidate_UI_Position pos=new Candidate_UI_Position();
    
    void generateCandidate(){
        
                String x=pos.getCandidates(forpost[ind]);
                System.out.println("POST="+forpost[ind]+" ---->"+x);
                String put[]=x.split(",");
                System.out.println(Arrays.asList(put));
                post.setText(forpost[ind]);
                System.out.println("x Length==="+x.length());
                if(x.length()<=0){
                        //Vanishing others...
                        candName1.setVisible(false);
                        candName2.setVisible(false);
                        candName3.setVisible(false);
                        candName4.setVisible(false);
                        candName5.setVisible(false);

                        aboutMe1.setVisible(false);
                        aboutMe2.setVisible(false);
                        aboutMe3.setVisible(false);
                        aboutMe4.setVisible(false);
                        aboutMe5.setVisible(false);

                        voteFavour1.setVisible(false);
                        voteFavour2.setVisible(false);
                        voteFavour3.setVisible(false);
                        voteFavour4.setVisible(false);
                        voteFavour5.setVisible(false);

                        cand1Image.setVisible(false);
                        cand2Image.setVisible(false);
                        cand3Image.setVisible(false);
                        cand4Image.setVisible(false);
                        cand5Image.setVisible(false);
                }
                else{
                    if(put.length==0){
                
                        //Vanishing others...
                        candName1.setVisible(false);
                        candName2.setVisible(false);
                        candName3.setVisible(false);
                        candName4.setVisible(false);
                        candName5.setVisible(false);

                        aboutMe1.setVisible(false);
                        aboutMe2.setVisible(false);
                        aboutMe3.setVisible(false);
                        aboutMe4.setVisible(false);
                        aboutMe5.setVisible(false);

                        voteFavour1.setVisible(false);
                        voteFavour2.setVisible(false);
                        voteFavour3.setVisible(false);
                        voteFavour4.setVisible(false);
                        voteFavour5.setVisible(false);

                        cand1Image.setVisible(false);
                        cand2Image.setVisible(false);
                        cand3Image.setVisible(false);
                        cand4Image.setVisible(false);
                        cand5Image.setVisible(false);
                    }
                    if(put.length==1){
                        candName1.setVisible(true);
                        aboutMe1.setVisible(true);
                        voteFavour1.setVisible(true);
                        cand1Image.setVisible(true);
                        candName1.setText(put[0]);
                       


                        //Vanishing others...
                        candName2.setVisible(false);
                        candName3.setVisible(false);
                        candName4.setVisible(false);
                        candName5.setVisible(false);

                        aboutMe2.setVisible(false);
                        aboutMe3.setVisible(false);
                        aboutMe4.setVisible(false);
                        aboutMe5.setVisible(false);

                        voteFavour2.setVisible(false);
                        voteFavour3.setVisible(false);
                        voteFavour4.setVisible(false);
                        voteFavour5.setVisible(false);

                        cand2Image.setVisible(false);
                        cand3Image.setVisible(false);
                        cand4Image.setVisible(false);
                        cand5Image.setVisible(false);
                    }
                    if(put.length==2){
                        
                        candName1.setVisible(true);
                        aboutMe1.setVisible(true);
                        voteFavour1.setVisible(true);
                        cand1Image.setVisible(true);
                        
                        candName2.setVisible(true);
                        aboutMe2.setVisible(true);
                        voteFavour2.setVisible(true);
                        cand2Image.setVisible(true);
                        
                        candName1.setText(put[0]);
                        candName2.setText(put[1]);



                        //Vanishing others...
                        //candName2.setVisible(false);
                        candName3.setVisible(false);
                        candName4.setVisible(false);
                        candName5.setVisible(false);

                        //aboutMe2.setVisible(false);
                        aboutMe3.setVisible(false);
                        aboutMe4.setVisible(false);
                        aboutMe5.setVisible(false);

                        //voteFavour2.setVisible(false);
                        voteFavour3.setVisible(false);
                        voteFavour4.setVisible(false);
                        voteFavour5.setVisible(false);

                        //cand2Image.setVisible(false);
                        cand3Image.setVisible(false);
                        cand4Image.setVisible(false);
                        cand5Image.setVisible(false);
                    }
                    if(put.length==3){
                        
                        candName1.setVisible(true);
                        aboutMe1.setVisible(true);
                        voteFavour1.setVisible(true);
                        cand1Image.setVisible(true);
                        
                        candName2.setVisible(true);
                        aboutMe2.setVisible(true);
                        voteFavour2.setVisible(true);
                        cand2Image.setVisible(true);
                        
                        candName3.setVisible(true);
                        aboutMe3.setVisible(true);
                        voteFavour3.setVisible(true);
                        cand3Image.setVisible(true);
                        
                        
                        candName1.setText(put[0]);
                        candName2.setText(put[1]);
                        candName3.setText(put[2]);


                        //Vanishing others...
                       // candName2.setVisible(false);
                       // candName3.setVisible(false);
                        candName4.setVisible(false);
                        candName5.setVisible(false);

                       // aboutMe2.setVisible(false);
                       // aboutMe3.setVisible(false);
                        aboutMe4.setVisible(false);
                        aboutMe5.setVisible(false);

                       // voteFavour2.setVisible(false);
                       // voteFavour3.setVisible(false);
                        voteFavour4.setVisible(false);
                        voteFavour5.setVisible(false);

                       // cand2Image.setVisible(false);
                       // cand3Image.setVisible(false);
                        cand4Image.setVisible(false);
                        cand5Image.setVisible(false);
                    }
                    if(put.length==4){
                        
                        candName1.setVisible(true);
                        aboutMe1.setVisible(true);
                        voteFavour1.setVisible(true);
                        cand1Image.setVisible(true);
                        
                        candName2.setVisible(true);
                        aboutMe2.setVisible(true);
                        voteFavour2.setVisible(true);
                        cand2Image.setVisible(true);
                        
                        candName3.setVisible(true);
                        aboutMe3.setVisible(true);
                        voteFavour3.setVisible(true);
                        cand3Image.setVisible(true);
                        
                        candName4.setVisible(true);
                        aboutMe4.setVisible(true);
                        voteFavour4.setVisible(true);
                        cand4Image.setVisible(true);
                        
                        
                        
                        candName1.setText(put[0]);
                        candName2.setText(put[1]);
                        candName3.setText(put[2]);
                        candName4.setText(put[3]);


                        //Vanishing others...
                       // candName2.setVisible(false);
                       // candName3.setVisible(false);
                      //  candName4.setVisible(false);
                        candName5.setVisible(false);

                       // aboutMe2.setVisible(false);
                       // aboutMe3.setVisible(false);
                      //  aboutMe4.setVisible(false);
                        aboutMe5.setVisible(false);

                       // voteFavour2.setVisible(false);
                       // voteFavour3.setVisible(false);
                      //  voteFavour4.setVisible(false);
                        voteFavour5.setVisible(false);

                       // cand2Image.setVisible(false);
                       // cand3Image.setVisible(false);
                       // cand4Image.setVisible(false);
                        cand5Image.setVisible(false);
                    }
                    if(put.length==5){
                        
                        candName1.setVisible(true);
                        aboutMe1.setVisible(true);
                        voteFavour1.setVisible(true);
                        cand1Image.setVisible(true);
                        
                        candName2.setVisible(true);
                        aboutMe2.setVisible(true);
                        voteFavour2.setVisible(true);
                        cand2Image.setVisible(true);
                        
                        candName3.setVisible(true);
                        aboutMe3.setVisible(true);
                        voteFavour3.setVisible(true);
                        cand3Image.setVisible(true);
                        
                        candName4.setVisible(true);
                        aboutMe4.setVisible(true);
                        voteFavour4.setVisible(true);
                        cand4Image.setVisible(true);
                        
                        candName5.setVisible(true);
                        aboutMe5.setVisible(true);
                        voteFavour5.setVisible(true);
                        cand5Image.setVisible(true);
                        
                        
                        candName1.setText(put[0]);
                        candName2.setText(put[1]);
                        candName3.setText(put[2]);
                        candName4.setText(put[3]);
                        candName5.setText(put[4]);
                    }
                }
        if(ind==forpost.length-1){
            nextPost.setEnabled(false);
        }
    }
    
    
    
    
     
    
    public BALLOT_CANDIDATES() {
        initComponents();
        setResizable(false);
        this.setDefaultCloseOperation(0);
        //Remove this invisibility clause later........
        previousPost.setVisible(false);
        
        voteButtonGroup.clearSelection();
        voteFavour1.setActionCommand("1");
        voteFavour2.setActionCommand("2");
        voteFavour3.setActionCommand("3");
        voteFavour4.setActionCommand("4");
        voteFavour5.setActionCommand("5");
        
        previousPost.setEnabled(false);
        
        //post.setText(forpost[ind]);
        int locInd=0;
        
        generateCandidate();
           // for(int i=0;i<forpost.length;i++){
                
           
           
           
           
          //  }
            
        /*    
        candName1.setText(candidate[locInd]);
        candName2.setText(candidate[(++locInd)%candidate.length]);
        candName3.setText(candidate[(++locInd)%candidate.length]);
        candName4.setText(candidate[(++locInd)%candidate.length]);
        candName5.setText(candidate[(++locInd)%candidate.length]);*/
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voteButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        post = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cand2Image = new javax.swing.JLabel();
        cand1Image = new javax.swing.JLabel();
        cand5Image = new javax.swing.JLabel();
        cand3Image = new javax.swing.JLabel();
        cand4Image = new javax.swing.JLabel();
        candName1 = new javax.swing.JLabel();
        candName2 = new javax.swing.JLabel();
        candName3 = new javax.swing.JLabel();
        candName4 = new javax.swing.JLabel();
        candName5 = new javax.swing.JLabel();
        voteFavour1 = new javax.swing.JRadioButton();
        voteFavour2 = new javax.swing.JRadioButton();
        voteFavour3 = new javax.swing.JRadioButton();
        voteFavour4 = new javax.swing.JRadioButton();
        voteFavour5 = new javax.swing.JRadioButton();
        aboutMe1 = new javax.swing.JButton();
        aboutMe2 = new javax.swing.JButton();
        aboutMe4 = new javax.swing.JButton();
        aboutMe3 = new javax.swing.JButton();
        aboutMe5 = new javax.swing.JButton();
        previousPost = new javax.swing.JButton();
        finalSubmit = new javax.swing.JButton();
        nextPost = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NATIONAL INSTITUTE OF TECHNOLOGY, SILCHAR");

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\NIT_Silchar_logo.png")); // NOI18N

        post.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        post.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        post.setText("POST");

        cand2Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cand2Image.setIcon(new javax.swing.ImageIcon("F:\\NetBeansProjects\\EVM_VOTER_NITS\\src\\LOADER\\man.png")); // NOI18N

        cand1Image.setBackground(new java.awt.Color(240, 240, 100));
        cand1Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cand1Image.setIcon(new javax.swing.ImageIcon("F:\\NetBeansProjects\\EVM_VOTER_NITS\\src\\LOADER\\man.png")); // NOI18N

        cand5Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cand5Image.setIcon(new javax.swing.ImageIcon("F:\\NetBeansProjects\\EVM_VOTER_NITS\\src\\LOADER\\man.png")); // NOI18N

        cand3Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cand3Image.setIcon(new javax.swing.ImageIcon("F:\\NetBeansProjects\\EVM_VOTER_NITS\\src\\LOADER\\man.png")); // NOI18N

        cand4Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cand4Image.setIcon(new javax.swing.ImageIcon("F:\\NetBeansProjects\\EVM_VOTER_NITS\\src\\LOADER\\man.png")); // NOI18N

        candName1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        candName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candName1.setText("CANDIDATE 1");

        candName2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        candName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candName2.setText("CANDIDATE 2");

        candName3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        candName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candName3.setText("CANDIDATE 3");

        candName4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        candName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candName4.setText("CANDIDATE 4");

        candName5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        candName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candName5.setText("CANDIDATE 5");

        voteButtonGroup.add(voteFavour1);
        voteFavour1.setText("VOTE FOR HIM");
        voteFavour1.setHideActionText(true);
        voteFavour1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voteFavour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteFavour1ActionPerformed(evt);
            }
        });

        voteButtonGroup.add(voteFavour2);
        voteFavour2.setText("VOTE FOR HIM");
        voteFavour2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voteFavour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteFavour2ActionPerformed(evt);
            }
        });

        voteButtonGroup.add(voteFavour3);
        voteFavour3.setText("VOTE FOR HIM");
        voteFavour3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voteFavour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteFavour3ActionPerformed(evt);
            }
        });

        voteButtonGroup.add(voteFavour4);
        voteFavour4.setText("VOTE FOR HIM");
        voteFavour4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voteFavour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteFavour4ActionPerformed(evt);
            }
        });

        voteButtonGroup.add(voteFavour5);
        voteFavour5.setText("VOTE FOR HIM");
        voteFavour5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voteFavour5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteFavour5ActionPerformed(evt);
            }
        });

        aboutMe1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        aboutMe1.setText("About Me");
        aboutMe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMe1ActionPerformed(evt);
            }
        });

        aboutMe2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        aboutMe2.setText("About Me");
        aboutMe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMe2ActionPerformed(evt);
            }
        });

        aboutMe4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        aboutMe4.setText("About Me");
        aboutMe4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMe4ActionPerformed(evt);
            }
        });

        aboutMe3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        aboutMe3.setText("About Me");
        aboutMe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMe3ActionPerformed(evt);
            }
        });

        aboutMe5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        aboutMe5.setText("About Me");
        aboutMe5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMe5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voteFavour1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(candName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cand1Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cand2Image, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(candName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voteFavour2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cand3Image, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(candName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voteFavour3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cand4Image, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(candName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voteFavour4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cand5Image, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(candName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voteFavour5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(aboutMe1)
                .addGap(91, 91, 91)
                .addComponent(aboutMe2)
                .addGap(89, 89, 89)
                .addComponent(aboutMe3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aboutMe4)
                .addGap(89, 89, 89)
                .addComponent(aboutMe5)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cand2Image, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cand1Image, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cand5Image, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cand3Image, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cand4Image, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(candName1)
                    .addComponent(candName2)
                    .addComponent(candName3)
                    .addComponent(candName4)
                    .addComponent(candName5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aboutMe1)
                    .addComponent(aboutMe2)
                    .addComponent(aboutMe4)
                    .addComponent(aboutMe3)
                    .addComponent(aboutMe5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voteFavour1)
                    .addComponent(voteFavour2)
                    .addComponent(voteFavour3)
                    .addComponent(voteFavour4)
                    .addComponent(voteFavour5))
                .addContainerGap())
        );

        previousPost.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        previousPost.setText("PREVIOUS POST");
        previousPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPostActionPerformed(evt);
            }
        });

        finalSubmit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        finalSubmit.setText("SUBMIT ALL VOTES");
        finalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalSubmitActionPerformed(evt);
            }
        });

        nextPost.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nextPost.setText(" NEXT POST ");
        nextPost.setEnabled(false);
        nextPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previousPost)
                        .addGap(261, 261, 261)
                        .addComponent(finalSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextPost))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(post)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousPost)
                    .addComponent(nextPost)
                    .addComponent(finalSubmit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPostActionPerformed
        // TODO add your handling code here:
        nextPost.setEnabled(true);
        
        voteFavour1.setSelected(false);
        voteFavour2.setSelected(false);
        voteFavour3.setSelected(false);
        voteFavour4.setSelected(false);
        voteFavour5.setSelected(false);
        
        
        if(voteButtonGroup.getSelection()==null){
            //If No button is selected.....
        }
        else{
            //If some button is selected....
            System.out.println("Entering the new value:-"+(ind));
            posChoice[ind]=Integer.parseInt(voteButtonGroup.getSelection().getActionCommand());
        }
        
        if(ind!=1){
            ind--;
        }
        else{
            previousPost.setEnabled(false);
        }
        post.setText(forpost[ind]);
        int locInd=0;
        candName1.setText(candidate[locInd]);
        candName2.setText(candidate[(++locInd)%candidate.length]);
        candName3.setText(candidate[(++locInd)%candidate.length]);
        candName4.setText(candidate[(++locInd)%candidate.length]);
        candName5.setText(candidate[(++locInd)%candidate.length]);
        
        
        
        voteButtonGroup.clearSelection();
        
    }//GEN-LAST:event_previousPostActionPerformed

    private void nextPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPostActionPerformed
        // TODO add your handling code here:
        //previousPost.setEnabled(true);
        
        /*
        voteFavour1.setSelected(false);
        voteFavour2.setSelected(false);
        voteFavour3.setSelected(false);
        voteFavour4.setSelected(false);
        voteFavour5.setSelected(false);
        */
        
       
        
        
        
        if(voteButtonGroup.getSelection()==null){
            //If No button is selected.....
        }
        else{
            //If some button is selected....
            //System.out.println("Entering the new value:-"+(ind));
            //posChoice[ind]=Integer.parseInt(voteButtonGroup.getSelection().getActionCommand());
            voteButtonGroup.clearSelection();
        }
        
        //ind=(++ind)%forpost.length;
        if(ind!=(forpost.length-1)){
            ind++;
        }
        else{
            nextPost.setEnabled(false);
        }
        
        generateCandidate();
        /*post.setText(forpost[ind]);
        int locInd=0;
        candName1.setText(candidate[locInd]);
        candName2.setText(candidate[(++locInd)%candidate.length]);
        candName3.setText(candidate[(++locInd)%candidate.length]);
        candName4.setText(candidate[(++locInd)%candidate.length]);
        candName5.setText(candidate[(++locInd)%candidate.length]);
        */
        
    }//GEN-LAST:event_nextPostActionPerformed

    private void voteFavour3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteFavour3ActionPerformed
        // TODO add your handling code here:
        posChoice[ind]=3;
        nextPost.setEnabled(true);
    }//GEN-LAST:event_voteFavour3ActionPerformed

    private void voteFavour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteFavour1ActionPerformed
        // TODO add your handling code here:
       posChoice[ind]=1;
       nextPost.setEnabled(true);
    }//GEN-LAST:event_voteFavour1ActionPerformed

    private void voteFavour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteFavour2ActionPerformed
        // TODO add your handling code here:
        posChoice[ind]=2;
        nextPost.setEnabled(true);
    }//GEN-LAST:event_voteFavour2ActionPerformed

    private void voteFavour4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteFavour4ActionPerformed
        // TODO add your handling code here:
        posChoice[ind]=4;
        nextPost.setEnabled(true);
    }//GEN-LAST:event_voteFavour4ActionPerformed

    private void voteFavour5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteFavour5ActionPerformed
        // TODO add your handling code here:
        posChoice[ind]=5;
        nextPost.setEnabled(true);
    }//GEN-LAST:event_voteFavour5ActionPerformed

    private void finalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalSubmitActionPerformed
        // TODO add your handling code here:
       /*if(ind==forpost.length-2){
           posChoice[++ind]=Integer.parseInt(voteButtonGroup.getSelection().getActionCommand());
       }
       else if(ind==1){
           posChoice[--ind]=Integer.parseInt(voteButtonGroup.getSelection().getActionCommand());
       }
       else{
           posChoice[ind]=Integer.parseInt(voteButtonGroup.getSelection().getActionCommand());
       }*/
       //This one is for log and debugging...
       for(int i=0;i<posChoice.length;i++){
        System.out.println(posChoice[i]);
        }
       
      //Debugging ends here... 
      //Inserting the posChoice into the Votes table...
      
      InsertIntoVotes iiv=new InsertIntoVotes();
      int temp=iiv.insertData(posChoice);
     System.out.println(temp);
      //Insertion complete...............
      
      
      
      int input = JOptionPane.showOptionDialog(null, "Vote recorded successfully. Thank You", "Success", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

      if(input == JOptionPane.OK_OPTION)
      {
            CONNECTION_CLIENT cli=new CONNECTION_CLIENT();
            this.dispose();
            cli.setVisible(true);
      }
      else{
            CONNECTION_CLIENT cli=new CONNECTION_CLIENT();
            this.dispose();
            cli.setVisible(true);
      }
        //System.out.println(voteButtonGroup.getSelection().getActionCommand());
    }//GEN-LAST:event_finalSubmitActionPerformed

    private void aboutMe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMe1ActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showOptionDialog(null, "I am a great person!", "Success", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }//GEN-LAST:event_aboutMe1ActionPerformed

    private void aboutMe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMe2ActionPerformed
        // TODO add your handling code here:
        
        int input = JOptionPane.showOptionDialog(null, "I am a great person!", "Success", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }//GEN-LAST:event_aboutMe2ActionPerformed

    private void aboutMe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMe3ActionPerformed
        // TODO add your handling code here:
        
        int input = JOptionPane.showOptionDialog(null, "I am a great person!", "Success", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }//GEN-LAST:event_aboutMe3ActionPerformed

    private void aboutMe4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMe4ActionPerformed
        // TODO add your handling code here:
        
        int input = JOptionPane.showOptionDialog(null, "I am a great person!", "Success", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }//GEN-LAST:event_aboutMe4ActionPerformed

    private void aboutMe5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMe5ActionPerformed
        // TODO add your handling code here:
        
        int input = JOptionPane.showOptionDialog(null, "I am a great person!", "Success", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }//GEN-LAST:event_aboutMe5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BALLOT_CANDIDATES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BALLOT_CANDIDATES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BALLOT_CANDIDATES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BALLOT_CANDIDATES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BALLOT_CANDIDATES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutMe1;
    private javax.swing.JButton aboutMe2;
    private javax.swing.JButton aboutMe3;
    private javax.swing.JButton aboutMe4;
    private javax.swing.JButton aboutMe5;
    private javax.swing.JLabel cand1Image;
    private javax.swing.JLabel cand2Image;
    private javax.swing.JLabel cand3Image;
    private javax.swing.JLabel cand4Image;
    private javax.swing.JLabel cand5Image;
    private javax.swing.JLabel candName1;
    private javax.swing.JLabel candName2;
    private javax.swing.JLabel candName3;
    private javax.swing.JLabel candName4;
    private javax.swing.JLabel candName5;
    private javax.swing.JButton finalSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextPost;
    private javax.swing.JLabel post;
    private javax.swing.JButton previousPost;
    private javax.swing.ButtonGroup voteButtonGroup;
    private javax.swing.JRadioButton voteFavour1;
    private javax.swing.JRadioButton voteFavour2;
    private javax.swing.JRadioButton voteFavour3;
    private javax.swing.JRadioButton voteFavour4;
    private javax.swing.JRadioButton voteFavour5;
    // End of variables declaration//GEN-END:variables
}
