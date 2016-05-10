package net.fauxpark.oled.font;

/**
 * A simple {@link Font} implementation, based on the original IBM PC character set.
 *
 * @author fauxpark
 * @see <a href="https://en.wikipedia.org/wiki/Code_page_437">Code page 437</a>
 */
public class CodePage437 implements Font {
	/**
	 * The name of the font's character set.
	 */
	public static final String NAME = "IBM437";

	/**
	 * The number of columns each glyph is comprised of.
	 */
	private static final int COLUMNS = 5;

	/**
	 * The number of rows each glyph is comprised of.
	 */
	private static final int ROWS = 8;

	/**
	 * The font glyphs.
	 */
	private static final int[] GLYPHS = {
		0x00, 0x00, 0x00, 0x00, 0x00,
		0x3E, 0x6B, 0x4F, 0x6B, 0x3E,
		0xC1, 0x94, 0xB0, 0x94, 0xC1,
		0x1C, 0x3E, 0x7C, 0x3E, 0x1C,
		0x18, 0x3C, 0x7E, 0x3C, 0x18,
		0x1C, 0x57, 0x7F, 0x57, 0x1C,
		0x1C, 0x5E, 0x7F, 0x5E, 0x1C,
		0x00, 0x18, 0x3C, 0x18, 0x00,
		0xFF, 0xE7, 0xC3, 0xE7, 0xFF,
		0x00, 0x18, 0x24, 0x18, 0x00,
		0xFF, 0xE7, 0xDB, 0xE7, 0xFF,
		0x30, 0x48, 0x4A, 0x36, 0x0E,
		0x26, 0x29, 0x79, 0x29, 0x26,
		0x60, 0x70, 0x3F, 0x01, 0x02,
		0x60, 0x7E, 0x0A, 0x35, 0x3F,
		0x5A, 0x24, 0x42, 0x24, 0x5A,
		0x7F, 0x3E, 0x1C, 0x1C, 0x08,
		0x08, 0x1C, 0x1C, 0x3E, 0x7F,
		0x14, 0x22, 0x7F, 0x22, 0x14,
		0x00, 0x5F, 0x00, 0x5F, 0x00,
		0x06, 0x09, 0x7F, 0x01, 0x7F,
		0x26, 0x4D, 0x55, 0x59, 0x22,
		0x18, 0x18, 0x18, 0x18, 0x18,
		0x94, 0xA2, 0xFF, 0xA2, 0x94,
		0x08, 0x04, 0x7E, 0x04, 0x08,
		0x10, 0x20, 0x7E, 0x20, 0x10,
		0x08, 0x08, 0x2A, 0x1C, 0x08,
		0x08, 0x1C, 0x2A, 0x08, 0x08,
		0x3E, 0x20, 0x20, 0x20, 0x20,
		0x0C, 0x1E, 0x0C, 0x1E, 0x0C,
		0x30, 0x38, 0x3E, 0x38, 0x30,
		0x06, 0x0E, 0x3E, 0x0E, 0x06,
		0x00, 0x00, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x5F, 0x00, 0x00,
		0x00, 0x03, 0x00, 0x03, 0x00,
		0x14, 0x7F, 0x14, 0x7F, 0x14,
		0x24, 0x2A, 0x7F, 0x2A, 0x12,
		0x20, 0x12, 0x08, 0x24, 0x02,
		0x36, 0x49, 0x59, 0x26, 0x50,
		0x00, 0x00, 0x03, 0x00, 0x00,
		0x00, 0x1C, 0x22, 0x41, 0x00,
		0x00, 0x41, 0x22, 0x1C, 0x00,
		0x00, 0x05, 0x02, 0x05, 0x00,
		0x08, 0x08, 0x3E, 0x08, 0x08,
		0x00, 0x80, 0x60, 0x00, 0x00,
		0x08, 0x08, 0x08, 0x08, 0x08,
		0x00, 0x00, 0x40, 0x00, 0x00,
		0x20, 0x10, 0x08, 0x04, 0x02,
		0x3E, 0x51, 0x49, 0x45, 0x3E,
		0x00, 0x42, 0x7F, 0x40, 0x00,
		0x72, 0x49, 0x49, 0x49, 0x46,
		0x21, 0x41, 0x49, 0x4D, 0x33,
		0x18, 0x14, 0x12, 0x7F, 0x10,
		0x27, 0x45, 0x45, 0x45, 0x39,
		0x3C, 0x4A, 0x49, 0x49, 0x31,
		0x41, 0x21, 0x11, 0x09, 0x07,
		0x36, 0x49, 0x49, 0x49, 0x36,
		0x46, 0x49, 0x49, 0x29, 0x1E,
		0x00, 0x00, 0x24, 0x00, 0x00,
		0x00, 0x80, 0x64, 0x00, 0x00,
		0x00, 0x08, 0x14, 0x22, 0x00,
		0x14, 0x14, 0x14, 0x14, 0x14,
		0x00, 0x22, 0x14, 0x08, 0x00,
		0x02, 0x01, 0x51, 0x09, 0x06,
		0x3E, 0x41, 0x5D, 0x55, 0x0E,
		0x7E, 0x09, 0x09, 0x09, 0x7E,
		0x7F, 0x49, 0x49, 0x49, 0x36,
		0x3E, 0x41, 0x41, 0x41, 0x22,
		0x7F, 0x41, 0x41, 0x41, 0x3E,
		0x7F, 0x49, 0x49, 0x49, 0x41,
		0x7F, 0x09, 0x09, 0x09, 0x01,
		0x3E, 0x41, 0x41, 0x51, 0x32,
		0x7F, 0x08, 0x08, 0x08, 0x7F,
		0x00, 0x41, 0x7F, 0x41, 0x00,
		0x20, 0x40, 0x41, 0x3F, 0x01,
		0x7F, 0x08, 0x14, 0x22, 0x41,
		0x7F, 0x40, 0x40, 0x40, 0x40,
		0x7F, 0x02, 0x1C, 0x02, 0x7F,
		0x7F, 0x04, 0x08, 0x10, 0x7F,
		0x3E, 0x41, 0x41, 0x41, 0x3E,
		0x7F, 0x09, 0x09, 0x09, 0x06,
		0x3E, 0x41, 0x51, 0x21, 0x5E,
		0x7F, 0x09, 0x19, 0x29, 0x46,
		0x26, 0x49, 0x49, 0x49, 0x32,
		0x01, 0x01, 0x7F, 0x01, 0x01,
		0x3F, 0x40, 0x40, 0x40, 0x3F,
		0x1F, 0x20, 0x40, 0x20, 0x1F,
		0x3F, 0x40, 0x38, 0x40, 0x3F,
		0x63, 0x14, 0x08, 0x14, 0x63,
		0x03, 0x04, 0x78, 0x04, 0x03,
		0x61, 0x51, 0x49, 0x45, 0x43,
		0x00, 0x7F, 0x41, 0x41, 0x00,
		0x02, 0x04, 0x08, 0x10, 0x20,
		0x00, 0x41, 0x41, 0x7F, 0x00,
		0x00, 0x02, 0x01, 0x02, 0x00,
		0x40, 0x40, 0x40, 0x40, 0x40,
		0x00, 0x03, 0x04, 0x00, 0x00,
		0x20, 0x54, 0x54, 0x38, 0x40,
		0x7F, 0x28, 0x44, 0x44, 0x38,
		0x38, 0x44, 0x44, 0x44, 0x28,
		0x38, 0x44, 0x44, 0x28, 0x7F,
		0x38, 0x54, 0x54, 0x54, 0x18,
		0x00, 0x08, 0x7E, 0x09, 0x02,
		0x18, 0xA4, 0xA4, 0x94, 0x78,
		0x7F, 0x08, 0x04, 0x04, 0x78,
		0x00, 0x44, 0x7D, 0x40, 0x00,
		0x20, 0x40, 0x44, 0x3D, 0x00,
		0x7F, 0x10, 0x28, 0x44, 0x00,
		0x00, 0x41, 0x7F, 0x40, 0x00,
		0x7C, 0x04, 0x78, 0x04, 0x78,
		0x7C, 0x08, 0x04, 0x04, 0x78,
		0x38, 0x44, 0x44, 0x44, 0x38,
		0xFC, 0x18, 0x24, 0x24, 0x18,
		0x18, 0x24, 0x24, 0x18, 0xFC,
		0x7C, 0x08, 0x04, 0x04, 0x08,
		0x48, 0x54, 0x54, 0x54, 0x24,
		0x00, 0x04, 0x3F, 0x44, 0x00,
		0x3C, 0x40, 0x40, 0x20, 0x7C,
		0x1C, 0x20, 0x40, 0x20, 0x1C,
		0x3C, 0x40, 0x30, 0x40, 0x3C,
		0x44, 0x28, 0x10, 0x28, 0x44,
		0x4C, 0x90, 0x90, 0x90, 0x7C,
		0x44, 0x64, 0x54, 0x4C, 0x44,
		0x00, 0x08, 0x36, 0x41, 0x00,
		0x00, 0x00, 0x7F, 0x00, 0x00,
		0x00, 0x41, 0x36, 0x08, 0x00,
		0x10, 0x08, 0x10, 0x20, 0x10,
		0x7C, 0x42, 0x41, 0x42, 0x7C,
		0x1E, 0xA1, 0x61, 0x21, 0x12,
		0x38, 0x42, 0x40, 0x22, 0x78,
		0x38, 0x54, 0x56, 0x55, 0x18,
		0x20, 0x56, 0x55, 0x3A, 0x40,
		0x20, 0x55, 0x54, 0x39, 0x40,
		0x20, 0x55, 0x56, 0x38, 0x40,
		0x20, 0x54, 0x55, 0x38, 0x40,
		0x1C, 0xA2, 0x62, 0x22, 0x14,
		0x38, 0x56, 0x55, 0x56, 0x18,
		0x38, 0x55, 0x54, 0x55, 0x18,
		0x38, 0x55, 0x56, 0x54, 0x18,
		0x00, 0x45, 0x7C, 0x41, 0x00,
		0x00, 0x4A, 0x7D, 0x42, 0x00,
		0x00, 0x49, 0x7A, 0x40, 0x00,
		0x78, 0x15, 0x14, 0x15, 0x78,
		0x78, 0x14, 0x15, 0x14, 0x78,
		0x7C, 0x56, 0x55, 0x44, 0x00,
		0x20, 0x54, 0x54, 0x3C, 0x54,
		0x7C, 0x0A, 0x09, 0x7F, 0x49,
		0x30, 0x4A, 0x49, 0x4A, 0x30,
		0x30, 0x4A, 0x48, 0x4A, 0x30,
		0x30, 0x49, 0x4A, 0x48, 0x30,
		0x38, 0x42, 0x41, 0x22, 0x78,
		0x38, 0x41, 0x42, 0x20, 0x78,
		0x4C, 0x91, 0x90, 0x91, 0x7C,
		0x38, 0x45, 0x44, 0x45, 0x38,
		0x3C, 0x41, 0x40, 0x41, 0x3C,
		0x38, 0x44, 0xFE, 0x44, 0x28,
		0x48, 0x7E, 0x49, 0x41, 0x62,
		0x29, 0x2A, 0xFC, 0x2A, 0x29,
		0xFF, 0x09, 0x29, 0xF6, 0xA0,
		0x40, 0x88, 0x7E, 0x09, 0x02,
		0x20, 0x54, 0x56, 0x39, 0x40,
		0x00, 0x48, 0x7A, 0x41, 0x00,
		0x30, 0x48, 0x4A, 0x49, 0x30,
		0x38, 0x40, 0x42, 0x21, 0x78,
		0x78, 0x12, 0x09, 0x0A, 0x71,
		0x7C, 0x0A, 0x11, 0x22, 0x7D,
		0x26, 0x29, 0x29, 0x27, 0x28,
		0x26, 0x29, 0x29, 0x26, 0x20,
		0x60, 0x90, 0x8A, 0x80, 0x40,
		0x38, 0x08, 0x08, 0x08, 0x08,
		0x08, 0x08, 0x08, 0x08, 0x38,
		0x2F, 0x10, 0xC8, 0xAC, 0xBA,
		0x2F, 0x10, 0x28, 0x34, 0xFA,
		0x00, 0x00, 0xFA, 0x00, 0x00,
		0x08, 0x14, 0x2A, 0x14, 0x22,
		0x22, 0x14, 0x2A, 0x14, 0x08,
		0x92, 0x00, 0x49, 0x00, 0x92,
		0xAA, 0x00, 0x55, 0x00, 0xAA,
		0xAA, 0x55, 0xAA, 0x55, 0xAA,
		0x00, 0x00, 0xFF, 0x00, 0x00,
		0x08, 0x08, 0xFF, 0x00, 0x00,
		0x14, 0x14, 0xFF, 0x00, 0x00,
		0x08, 0xFF, 0x00, 0xFF, 0x00,
		0x08, 0xF8, 0x08, 0xF8, 0x00,
		0x14, 0x14, 0xFC, 0x00, 0x00,
		0x14, 0xF7, 0x00, 0xFF, 0x00,
		0x00, 0xFF, 0x00, 0xFF, 0x00,
		0x14, 0xF4, 0x04, 0xFC, 0x00,
		0x14, 0x17, 0x10, 0x1F, 0x00,
		0x10, 0x1F, 0x10, 0x1F, 0x00,
		0x14, 0x14, 0x1F, 0x00, 0x00,
		0x08, 0x08, 0xF8, 0x00, 0x00,
		0x00, 0x00, 0x0F, 0x08, 0x08,
		0x08, 0x08, 0x0F, 0x08, 0x08,
		0x08, 0x08, 0xF8, 0x08, 0x08,
		0x00, 0x00, 0xFF, 0x08, 0x08,
		0x08, 0x08, 0x08, 0x08, 0x08,
		0x08, 0x08, 0xFF, 0x08, 0x08,
		0x00, 0x00, 0xFF, 0x14, 0x14,
		0x00, 0xFF, 0x00, 0xFF, 0x08,
		0x00, 0x1F, 0x10, 0x17, 0x14,
		0x00, 0xFC, 0x04, 0xF4, 0x14,
		0x14, 0x17, 0x10, 0x17, 0x14,
		0x14, 0xF4, 0x04, 0xF4, 0x14,
		0x00, 0xFF, 0x00, 0xF7, 0x14,
		0x14, 0x14, 0x14, 0x14, 0x14,
		0x14, 0xF7, 0x00, 0xF7, 0x14,
		0x14, 0x14, 0x17, 0x14, 0x14,
		0x08, 0x0F, 0x08, 0x0F, 0x08,
		0x14, 0x14, 0xF4, 0x14, 0x14,
		0x08, 0xF8, 0x08, 0xF8, 0x08,
		0x00, 0x0F, 0x08, 0x0F, 0x08,
		0x00, 0x00, 0x1F, 0x14, 0x14,
		0x00, 0x00, 0xFC, 0x14, 0x14,
		0x00, 0xF8, 0x08, 0xF8, 0x08,
		0x08, 0xFF, 0x00, 0xFF, 0x08,
		0x14, 0x14, 0xF7, 0x14, 0x14,
		0x08, 0x08, 0x08, 0x0F, 0x00,
		0x00, 0x00, 0xF8, 0x08, 0x08,
		0xFF, 0xFF, 0xFF, 0xFF, 0xFF,
		0xF0, 0xF0, 0xF0, 0xF0, 0xF0,
		0xFF, 0xFF, 0xFF, 0x00, 0x00,
		0x00, 0x00, 0x00, 0xFF, 0xFF,
		0x0F, 0x0F, 0x0F, 0x0F, 0x0F,
		0x38, 0x44, 0x44, 0x38, 0x44,
		0xFC, 0x4A, 0x4A, 0x34, 0x00,
		0x7F, 0x01, 0x01, 0x01, 0x01,
		0x04, 0x7C, 0x04, 0x7C, 0x04,
		0x63, 0x55, 0x49, 0x41, 0x41,
		0x38, 0x44, 0x44, 0x3C, 0x04,
		0xFC, 0x20, 0x20, 0x1C, 0x20,
		0x04, 0x3C, 0x44, 0x44, 0x04,
		0x1C, 0x22, 0x7F, 0x22, 0x1C,
		0x1C, 0x22, 0x49, 0x22, 0x1C,
		0x5C, 0x62, 0x02, 0x62, 0x5C,
		0x30, 0x4A, 0x4D, 0x49, 0x30,
		0x30, 0x48, 0x30, 0x48, 0x30,
		0xBC, 0x62, 0x5A, 0x46, 0x3D,
		0x14, 0x2A, 0x2A, 0x22, 0x14,
		0x7E, 0x01, 0x01, 0x01, 0x7E,
		0x2A, 0x2A, 0x2A, 0x2A, 0x2A,
		0x44, 0x44, 0x5F, 0x44, 0x44,
		0x40, 0x51, 0x4A, 0x44, 0x40,
		0x40, 0x44, 0x4A, 0x51, 0x40,
		0x00, 0x00, 0xFE, 0x01, 0x02,
		0x40, 0x80, 0x7F, 0x00, 0x00,
		0x08, 0x08, 0x2A, 0x08, 0x08,
		0x00, 0x24, 0x12, 0x24, 0x12,
		0x00, 0x02, 0x05, 0x02, 0x00,
		0x00, 0x00, 0x18, 0x18, 0x00,
		0x00, 0x00, 0x10, 0x00, 0x00,
		0x20, 0x40, 0x80, 0xFF, 0x01,
		0x00, 0x0F, 0x02, 0x01, 0x0E,
		0x00, 0x00, 0x09, 0x0D, 0x0A,
		0x00, 0x38, 0x38, 0x38, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x00
	};

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getColumns() {
		return COLUMNS;
	}

	@Override
	public int getRows() {
		return ROWS;
	}

	@Override
	public int[] getGlyphs() {
		return GLYPHS;
	}
}
