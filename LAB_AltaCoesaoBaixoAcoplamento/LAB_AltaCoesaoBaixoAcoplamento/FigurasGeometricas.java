
public class FigurasGeometricas {

	public static final int R = -1;
	public static final int Q = 0;
	public static final int C = 1;
	public static final int T = 2;
	
	private int alturaRetangulo;
	private int larguraRetangulo;
	private int larguraQuadrado;
	private int raioCirculo; 
	
	public FigurasGeometricas(int altura, int largura, int lado, int raio){
		this.alturaRetangulo = altura;
		this.larguraRetangulo = largura;
		this.larguraQuadrado = lado;
		this.raioCirculo = raio;
	}
	
	public void a(int tipoDaFigura){
		switch (tipoDaFigura) {
		case R:
			System.out.println("A área deste retângulo é: " + alturaRetangulo * larguraRetangulo);
			break;
		case Q:
			System.out.println("A área deste quadrado é: " + 2 * larguraQuadrado);
			break;
		case C:
			System.out.println("A área deste círculo é: " + (2 * 3.14 * raioCirculo));
			break;
		case T:
			System.out.println("Todas as áreas são: " +  (alturaRetangulo * larguraRetangulo) + " " + (2 * larguraQuadrado) + " e " 
					+ (2 * 3.14 * raioCirculo) + " retângulo, quadrado e círculo, respectivamente");
			break;
		default:
			System.out.println("O valor que vc forneceu não representa nenhuma figura geométrica conhecida!");
			break;
		}
	}

	public int p(int tipoDaFigura){
		
		int perimetro;
		
		if (tipoDaFigura == -1){
			perimetro = (2 * alturaRetangulo) + (2 * larguraRetangulo);
			System.out.println("O perímetro do retângulo é: " + perimetro);
		}else if (tipoDaFigura == 0){
			perimetro = 4 * larguraQuadrado;
			System.out.println("O perímetro do quadrado é: " + perimetro);
		}else if (tipoDaFigura == 1){
			perimetro = (int) (3.14 * raioCirculo);
			System.out.println("O perímetro do círculo é: " + perimetro);
		}else if (tipoDaFigura == 2){
			perimetro = -234;
		}else{
			perimetro = -2658;
		}
		return perimetro;
	}
	
	public String toStringDaFigura(int tipoDaFigura){
		String toString;
		switch (tipoDaFigura) {
		case R:
			toString = "O retângulo criado tem altura de tamanho: " + alturaRetangulo + 
			"e largura de tamanho: " + larguraRetangulo;
			break;
		case Q:
			toString = "O quadrado criado tem lados de tamanho: " + larguraQuadrado; 
			break;
		case C:
			toString = "O circulo criado tem raio de tamanho: " + raioCirculo;
			break;
		case T:
			toString = "O retângulo criado tem altura: " + alturaRetangulo + " e largura de: " + larguraRetangulo +
			" O quadrado criado tem lados de: " + larguraQuadrado +
			" O circulo criado tem raio de: " + raioCirculo;
			break;

		default:
			toString = null;
			break;
		}
		return toString;
	}
}
