import java.util.Scanner;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

import com.jogamp.opengl.util.FPSAnimator;

public class Shape_TransformationRotation_scaling implements GLEventListener {
	public static float rotation = 0, scaleX, scaleY;
	static int input;
	static Scanner scanner = new Scanner(System.in);

	@Override
	public void display(GLAutoDrawable drawable) {

		if (input == 1) {

			final GL2 gl = drawable.getGL().getGL2();
			gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

			// Clear The Screen And The Depth Buffer
			gl.glLoadIdentity(); // Reset The View

			// triangle rotation
			// gl.glRotatef(45, 0.0f, 0.0f, 1.0f);

			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(1.0f, 1.0f, 0.0f);
			gl.glVertex2d(0.5, 0.5);
			gl.glVertex2d(0.5, -0.5);
			gl.glVertex2d(-0.5, -0.5);
			gl.glVertex2d(-0.5, 0.5);

			gl.glEnd();

			gl.glRotatef(rotation, 0.0f, 0.0f, 1.0f);

			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(0.0f, 1.0f, 0.0f);
			gl.glVertex2d(0.5, 0.5);
			gl.glVertex2d(0.5, -0.5);
			gl.glVertex2d(-0.5, -0.5);
			gl.glVertex2d(-0.5, 0.5);

			gl.glEnd();
			gl.glFlush();

		} else if (input == 2) {

			final GL2 gl = drawable.getGL().getGL2();
			gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

			// Clear The Screen And The Depth Buffer
			gl.glLoadIdentity(); // Reset The View

			// triangle rotation
			// gl.glRotatef(45, 0.0f, 0.0f, 1.0f);

			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(1.0f, 1.0f, 0.0f);
			gl.glVertex2d(0.5, 0.5);
			gl.glVertex2d(0.5, -0.5);
			gl.glVertex2d(-0.5, -0.5);
			gl.glVertex2d(-0.5, 0.5);

			gl.glEnd();

			gl.glScalef(scaleX, scaleY, 0f);

			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(0.0f, 1.0f, 0.0f);
			gl.glVertex2d(0.5, 0.5);
			gl.glVertex2d(0.5, -0.5);
			gl.glVertex2d(-0.5, -0.5);
			gl.glVertex2d(-0.5, 0.5);

			gl.glEnd();

			gl.glFlush();

		} else if (input == 3) {

			final GL2 gl = drawable.getGL().getGL2();
			gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

			// Clear The Screen And The Depth Buffer
			gl.glLoadIdentity(); // Reset The View

			// triangle rotation
			// gl.glRotatef(45, 0.0f, 0.0f, 1.0f);

			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(1.0f, 1.0f, 0.0f);
			gl.glVertex2d(0.5, 0.5);
			gl.glVertex2d(0.5, -0.5);
			gl.glVertex2d(-0.5, -0.5);
			gl.glVertex2d(-0.5, 0.5);

			gl.glEnd();

			// gl.glScalef(scaleX, scaleY, 0f);

			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(0.0f + scaleX, 1.0f + scaleX, 0.0f);
			gl.glVertex2d(0.5 + scaleX, 0.5 + scaleX);
			gl.glVertex2d(0.5 + scaleX, -0.5 + scaleX);
			gl.glVertex2d(-0.5 + scaleX, -0.5 + scaleX);
			gl.glVertex2d(-0.5 + scaleX, 0.5 + scaleX);

			gl.glEnd();

			gl.glFlush();

		}

		else if (input == 4) {

			final GL2 gl = drawable.getGL().getGL2();
			gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

			// Clear The Screen And The Depth Buffer
			gl.glLoadIdentity(); // Reset The View

			gl.glRotatef(rotation, 0.0f, 1.0f, 0.0f);
			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(0, 0.537f, 0.482f);
			gl.glVertex2d(0.5, 0.5);
			gl.glVertex2d(0.5, -0.5);
			gl.glVertex2d(-0.5, -0.5);
			gl.glVertex2d(-0.5, 0.5);
			gl.glEnd();

			gl.glRotatef(rotation, 1.0f, 0.0f, 0.0f);
			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(1,1,0);
			gl.glVertex2d(0.5, 0.5);
			gl.glVertex2d(0.5, -0.5);
			gl.glVertex2d(-0.5, -0.5);
			gl.glVertex2d(-0.5, 0.5);
			gl.glEnd();
			
			gl.glRotatef(rotation, 0.0f, 0.0f, 1.0f);
			gl.glBegin(GL2.GL_POLYGON);
			// Green Color
			gl.glColor3f(0.557f, 0.141f, 0.667f);
			gl.glVertex2d(0.5, 0.5);
			gl.glVertex2d(0.5, -0.5);
			gl.glVertex2d(-0.5, -0.5);
			gl.glVertex2d(-0.5, 0.5);
			gl.glEnd();

			gl.glFlush();
			rotation += 0.2f; // assigning the angle

		}

	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// method body
	}

	@Override
	public void init(GLAutoDrawable arg0) {
		// method body
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
	}

	public static void main(String[] args) {

		System.out.println("Select Operation: \n1.Rotation\n2.Scaling\n3.Traslation\n4.Animation");
		input = scanner.nextInt();

		switch (input) {
		case 1:
			System.out.println("Input rotation angle: \n");
			rotation = scanner.nextFloat();
			break;
		case 2:

			System.out.println("Input x scale, y scale multiple by: \n");
			scaleX = scanner.nextFloat();
			scaleY = scanner.nextFloat();

			break;
		case 3:

			System.out.println("Input x , y Transformation (-0.5 to 0.5): \n");
			scaleX = scanner.nextFloat();
			scaleY = scanner.nextFloat();

			break;
		case 4:

			break;

		default:
			System.err.println("Invalid input");
			return;
		}

		final GLProfile gp = GLProfile.get(GLProfile.GL2);
		GLCapabilities cap = new GLCapabilities(gp);

		final GLCanvas gc = new GLCanvas(cap);
		Shape_TransformationRotation_scaling jr = new Shape_TransformationRotation_scaling();
		gc.addGLEventListener(jr);
		gc.setSize(400, 400);

		final JFrame frame = new JFrame("JOGL Rotation");

		frame.add(gc);
		frame.setSize(500, 400);
		frame.setVisible(true);

		final FPSAnimator animator = new FPSAnimator(gc, 400, true);
		animator.start();

	}

}