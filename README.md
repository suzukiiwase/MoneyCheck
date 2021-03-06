# MoneyCheck 割り勘アプリ

//***********************************************************************//  
【ソフト名】	warikan Ver1.0  
【著作権者】　　鈴木かれん 岩瀬友紀  
【制作日】　　　2016/3/23.  
【種　別】	フリーソフトウェア  
【連絡先】　　　iwase.suzuki.chino@gmail.com  
【配布元】　    https://www.dropbox.com/s/5rj0ysijzfiukty/warikan.apk?dl=0  
【転載の可否】　可  
【登 録 名】　　warikan.apk  
【圧縮形式】　　warikan.apk  
【動作環境】　　Android  
【開発環境】　　Android Studio 1.4  
//***********************************************************************//  
##≪著作権および免責事項≫

　本ソフトはフリーソフトです。個人／団体／社内利用を問わず、ご自由にお使い下さい。  
　なお，著作権は作者である鈴木かれん並びに岩瀬友紀が保有しています。  

　このソフトウェアを使用したことによって生じたすべての障害・損害・不具合等に関しては、  私と私の関係者および私の所属するいかなる団体・組織とも 、一切の責任を負いません。各自の責任においてご使用ください。  
  
  
  
  
##＜はじめに＞  
  warikanは、割り勘計算をするためのアプリケーションです。  
  Android端末で動作します。  
  
  主な特長：  
  1)金額、人数を入力しボタン1つ押すだけで1発計算  	
  2)様々なシチュエーションに対応する4つのモードつき  
  3)シンプルかつ可愛さを兼ね備えた、使い易い・見易いデザイン  
  
  
  
  
  
##＜主なファイル構成＞  
　・readme.txt　　　(説明ファイル)    
　・warikan.apk	  　(apkファイル)    
##＜javaソースコード＞
(MoneyCheck/app/src/main/java/com/example/android62/moneycheck/)  
  ・Normal.java     （普通モード）  
  ・Boss.java       （上司モード）  
  ・Female.java     （女性モード）  
  ・Lose.java       （罰ゲームモード)  
  ・MoneyCheckController.java     （コントローラ）  
##＜xmlファイル＞  
(MoneyCheck/app/src/main/res/layout)  
  ・activity_normal.xml       （普通モード内のレイアウト）  
  ・activity_boss.xml         （上司モード内のレイアウト）   
  ・activity_female.xml       （女性モード内のレイアウト）   
  ・activity_lose.xml         （罰ゲームモード内のレイアウト）   
  ・menu.xml            （メニュー画面のレイアウト）  
  
  (MoneyCheck/app/src/main/res/value)       
  ・array.xml  (spinner内を定義)    
　・strirg.xml  (文字列を定義)    
　・style.xml   (レイアウトスタイルの定義）    
　・dimens.xml  （テキストサイズの定義）    
　・colors.xml  　（カラーの定義）    
  
  
##＜インストール方法＞
　※必ずAndroid端末をご用意ください。  
  
  導入方法１(推奨)
　　１.ダウンロードする端末を以下のように設定してください。  
　 　　「セキュリティ」→「提供元不明のアプリを許可」にチェックを入れる  
　　２.下記URLにandroid端末から接続しダウンロードしてください。配布ファイル(warikan.apk)自体がインストーラです
　　　　https://www.dropbox.com/s/5rj0ysijzfiukty/warikan.apk?dl=0
  
  導入方法２(apkファイルをROMからダウンロードする方法)
  　下記URLを参考にインストールをお願いします。
  　http://pentan.info/android/apk_install.html
  　　
  
  
  
##＜アンインストール方法＞
　　削除したくなった時は、コントロールパネルの中の  「アプリケーションの追加と削除」のアイコンを開いて、  
  一覧から「warikan(アンインストール)」を選択して下さい。  
  
  
  
  
  
##＜使用方法＞
　1.warikanをタッチします。  
　2.アプリが起動します。  
　3.状況に応じて4つのモードをお楽しみください。  
　4.その他の使い方は『使い方』ボタンを参照して下さい。  
  
  
  
  
  
##＜最後に＞
　
　作成に関係してくださった方々に深く感謝致します。  
　また、本作品を使用してくださっている、皆様にも深く感謝致します。  
  
  

##＜スクリーンショット＞  
  ![Alt text](/menu.jpg) ![Alt text](/lose.jpg)
  
  
  
  
--以上--  
