android����
1.��ijkplayer-k0.4.5.1.tar.gz�ϴ���ubuntu 14�Ͻ�ѹ(��Ҫ���ú�ndk��������)
2.ִ��cd config
3.ִ��rm module.sh
4.ִ��cd ..
5.ִ��./init-config.sh
6.ִ��./init-android.sh
7.ִ��cd android/contrib
8.ִ��./compile-ffmpeg.sh clean
9.ִ��./compile-ffmpeg.sh armv7a
10.ִ��cd ..
11.ִ��./compile-ijk.sh armv7a

ios����
1.�½�ijkplayer�ļ���
2.��ijkplayer-k0.4.5.1.tar.gz�ϴ���ijkplayer�ļ����º��ѹ
3.��ijkplayer�ļ������½�3���ļ���x264,fdk-aac,librtmp
4.������õ�x264,fdk-aac,librtmp��ͷ�ļ��;�̬��ֱ𿽱�����Ӧ�ļ�����
5.�޸�librtmp/lib/pkgconfig�µ�librtmp.pc�ļ�����,"prefix"�ֶε�������Ҫ�޸�Ϊ��ǰlibrmtp�ļ������ڵľ���·��
6.ִ��cd ijkplayer-k0.4.5.1
7.ִ��cd config
8.ִ��rm module.sh
9.ִ��cd ..
10.ִ��./init-config.sh
11.ִ��./init-ios.sh
12.ִ��cd iOS
13.ִ��./compile-ffmpeg.sh clean
14.ִ��./compile-ffmpeg.sh all