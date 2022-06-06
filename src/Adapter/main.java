package Adapter;

public class main {
	VietnameseTarget target  = new TranslatorAdapter(new JapaneseAdaptee()) ;
	target.send("Xin chào!") ;
}
