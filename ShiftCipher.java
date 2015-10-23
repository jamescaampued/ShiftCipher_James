class ShiftCipher
{
    private String origString;
    private String cipherString;
    private String decipheredString;
    private int shift;
    private String getAlphabet()
    {
        return "abcdefghijklmnopqrstuvwxyz";
    }
    public ShiftCipher(String plain, int shift)
    {
        this.origString = ______________;
        this.shift = ______________;
    }
    private char shiftLetter(char origLetter, String type)
    {
        String alphabet = this.getAlphabet();
        int letterPosition = alphabet.indexOf(_________________);
        char shiftedLetter;
        int shiftedPosition = 0;
        if (type.equals("encrypt"))
        {
            shiftedPosition = ___________________________________________________;
        }
        else if (type.equals("decrypt"))
        {
            shiftedPosition = ___________________________________________________;
            if (shiftedPosition < 0)
            {
                shiftedPosition = ________________________________;
            }
        }
        shiftedLetter = alphabet.charAt(___________________);
        return shiftedLetter;
    }
    public void cipher()
    {
        this.origString = this.origString.toLowerCase();
        this.cipherString = "";
        char shiftedLetter;
        for (char letter: this.origString.toCharArray())
        {
            shiftedLetter = this.shiftLetter(letter, "encrypt");
            this._______________ += shiftedLetter;
        }
    } public String getCiphered()
    {
        return ___________________;
    }

    public void decipher()
    {
        this.cipherString = this.cipherString.toLowerCase();
        this.decipheredString = "";
        char shiftedLetter;
        for (char letter: this.cipherString.toCharArray())
        {
            shiftedLetter = this.shiftLetter(letter, "decrypt");
            this._____________ += shiftedLetter;
        }
    }
    public String getDeciphered()
    {
        return ___________________;
    }
}
