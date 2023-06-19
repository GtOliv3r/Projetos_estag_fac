package classes;
import java.util.ArrayList;
import java.util.Random;
import java.awt.*;

import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class ScreenProtector extends javax.swing.JFrame implements Runnable{

	// tamanho da tela
	private int height = 1000;
	private int whidth = 1500;
	
	// teclas
	/*
	 * Funcionamento: quando a tecla é pressionada sua respectiva variável fica 
	 * com valor True. Quando solta a variável fica com valor False.
	 */
	private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
	
    // Construtor
	public ScreenProtector() {
        // Chama o metodo que realiza todas as configurações iniciais necessárias
		initComponents();
		
		// Mecanismo de execução paralela
        createBufferStrategy(2);
        Thread t = new Thread(this);
        t.start();
    }
	

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Realiza todas as configurações iniciais necessárias
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Chama os métodos de Scaneamento de teclas (tecla pressionada / solta)
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        
        // Configura o layout da tela
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // Largura
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, whidth, Short.MAX_VALUE)
        );
        // Altura
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, height, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que verifica se as teclas foram pressionadas
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // Verifica se a tecla seta para a esquerda foi pressiona
    	if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            // coloca o valor da variavel left em true enquanto a tecla estiver pressionada
    		left = true;
        }
    	// Verifica se a tecla seta para a direita foi pressiona
    	else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        	// coloca o valor da variavel right em true enquanto a tecla estiver pressionada
        	right = true;
        }
    	// Verifica se a tecla seta para cima foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_UP) 
        {
        	// coloca o valor da variavel up em true enquanto a tecla estiver pressionada
            up = true;
        }
    	// Verifica se a tecla seta para baixo foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) 
        {
        	// coloca o valor da variavel down em true enquanto a tecla estiver pressionada
            down = true;
        }
    }//GEN-LAST:event_formKeyPressed

    // Método que verifica se as teclas foram soltas
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
    	// Verifica se a tecla seta para a esquerda foi solta
    	if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
    		// volta o valor da variavel left em false depois que a tecla for solta
    		left = false;
        } 
    	// Verifica se a tecla seta para a direita foi solta
    	else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
    		// volta o valor da variavel right em false depois que a tecla for solta
    		right = false;
        }
    	// Verifica se a tecla seta para cima foi solta
    	else if (evt.getKeyCode() == KeyEvent.VK_UP) {
    		// volta o valor da variavel up em false depois que a tecla for solta
    		up = false;
        }
    	// Verifica se a tecla seta para baixo foi solta
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
        	// volta o valor da variavel down em false depois que a tecla for solta
        	down = false;
        }
    }//GEN-LAST:event_formKeyReleased
	
	// Inicializa a janela
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenProtector().setVisible(true);
            }
        });
        
        
	}
	
	
	// Implemente seu código aqui.
	public void run() {
		// A variável g recebe o objeto do tipo Graphics que permite gerar imagens na tela
		Graphics g = getBufferStrategy().getDrawGraphics();
		
		// Instancie suas formas geométricas aqui	
		
		Random random = new Random();
		ArrayList<Shape> shapes = new ArrayList <Shape>();
		Image logo = new Image ("/images/logoSenai.png", 500,500);
		logo.scale(0.5);
		
		
		//Rectangle [] r = new Rectangle[5];
		
		//Square [] s = new Square[5];
		
		//Ellipse [] e = new Ellipse[5];
		
		//Circle [] c = new Circle[5];
		
		//Color color2 = new Color(r,g,b);
		
		for(int i=0;i<20;i++) {
			shapes.add(new Rectangle(colorGenerate(),
					random.nextInt(getWidth()-200),
					random.nextInt(getHeight()-200),
					random.nextInt(70)+10,
					random.nextInt(70)));
			
			shapes.add(new Ellipse(colorGenerate(),
					random.nextInt(getWidth()-200),
					random.nextInt(getHeight()-200),
					random.nextInt(70)+10,
					random.nextInt(70)));
			
			shapes.add(new Square(colorGenerate(),
					random.nextInt(getWidth()-200),
					random.nextInt(getHeight()-200),
					random.nextInt(70)+10));
			
			shapes.add(new Circle(colorGenerate(),
					random.nextInt(getWidth()-200),
					random.nextInt(getHeight()-200),
					random.nextInt(70)+10));
		}
		
		//Aleatorizando a movimentação das formas
		
		for(Shape s : shapes) {
			if (random.nextBoolean())
				s.setSpeedX(-1);
			
			if(random.nextBoolean())
				s.setSpeedY(-1);
		}
		
	
		
		
		
		
		
		/*for(int i=0;i<5;i++) {
			s[i] = new Square(colorGenerate(),
					random.nextInt(getWidth()-200),
					random.nextInt(190)+10,
					random.nextInt(200));
		}
		
		for(int i=0;i<5;i++) {
			e[i] = new Ellipse(colorGenerate(),
					random.nextInt(getWidth()-200),
					random.nextInt(getHeight()-200),
					random.nextInt(190)+10,
					random.nextInt(200));
		}
		
		for(int i=0;i<5;i++) {
			c[i] = new Circle(colorGenerate(),
					random.nextInt(getWidth()-200),
					random.nextInt(190)+10,
					random.nextInt(200));
		}
		
		
		*/
		
		
		Rectangle r1 = new Rectangle (Color.GREEN,100,100,50,100);
		
		Rectangle r2 = new Rectangle (Color.GREEN,300,300,200,80);
	
		Ellipse e1 = new Ellipse(Color.RED,500,300,50,100);
		
		Square s1 = new Square(Color.GRAY,100,500,100);
		
		Circle c1 = new Circle(Color.BLACK,800,100,100);
		
		// Como num desenho animado, as animações são criadas a partir da sobreposição de frames
		while(true) {
		
			g = getBufferStrategy().getDrawGraphics();
			//limpa tela
			g.clearRect(0, 0, getWidth(), getHeight());
			
		
			// Implemente sua animação aqui.
			
			for(Shape s : shapes) {
				
				s.draw(g);
				s.move();
				s.changeDir(0, getWidth(), 0, getHeight());
			}
			
			logo.draw(g);
			
			if(right)
				logo.moveX(1);
			if(left)
				logo.moveX(-1);
			if(down)
				logo.moveY(1);
			if(up)
				logo.moveY(-1);
			
			logo.getColision(getWidth(), getHeight());
			
			
			/*
			for(Square sqr : s) {
				
				sqr.draw(g);
				sqr.move();
				sqr.changeDir(0, getWidth(), 0, getHeight());
			}
			
			for(Ellipse ell : e) {
				
				ell.draw(g);
				ell.move();
				ell.changeDir(0, getWidth(), 0, getHeight());
			}
			
			for(Circle crc : c) {
				
				crc.draw(g);
				crc.move();
				crc.changeDir(0, getWidth(), 0, getHeight());
			}
			*/
			
			
			
			// Exibe a tela
      getBufferStrategy().show();
            
      // Unidade de tempo da animação
      try {
        Thread.sleep(1);
      }catch  (InterruptedException ex) {}
		}
	}//Fim do RUN
	
	public Color colorGenerate() {
		int r,g,b;
		Random random = new Random();
		
		r = random.nextInt(255);
		g = random.nextInt(255);
		b = random.nextInt(255);
		
		return new Color(r,g,b);
	}
	

}//Fim da classe Screen Protector



