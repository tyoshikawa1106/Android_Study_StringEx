package tyoshikawa1106.studty.stringex;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

// ������̕`��
public class StringView extends View {
    //�R���X�g���N�^
    public StringView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);
    }
    
    //�`��
    @Override
    protected void onDraw(Canvas canvas) {
        //�`��I�u�W�F�N�g�̐���
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        
        //�����T�C�Y�ƕ����F�̎w��
        paint.setTextSize(24);
        paint.setColor(Color.rgb(0,0,0));
        
        //��ʃT�C�Y�̎擾
        canvas.drawText("��ʃT�C�Y : " + getWidth() + " �~ " + getHeight(), 0, 60, paint);
        
        //�������̎擾
        canvas.drawText("������ : " + (int)paint.measureText("A"), 0, 60 * 2, paint);
        
        //�A�Z���g�E�f�B�Z���g�̎擾
        canvas.drawText("�A�Z���g : " + (int)paint.ascent(), 0, 60 * 3, paint);
        canvas.drawText("�f�B�Z���g : " + (int)paint.descent(), 0, 60 * 4, paint);
        
        //24�h�b�g�̕�����̕\��
        paint.setTextSize(24);
        paint.setColor(Color.rgb(255, 0, 0));
        canvas.drawText("24dot", 0, 60 * 5, paint);
        
        //32�h�b�g�̕�����̕\��
        paint.setTextSize(32);
        paint.setColor(Color.rgb(255, 0, 0));
        canvas.drawText("32dot", 0, 60 * 6, paint);
        
        //48�h�b�g�̕�����̕\��
        paint.setTextSize(48);
        paint.setColor(Color.rgb(255, 0, 0));
        canvas.drawText("48dot", 0, 60 * 7, paint);
    }

}
