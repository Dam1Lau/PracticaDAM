<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : style5.xsl
    Created on : 19 de febrero de 2018, 12:48
    Author     : dam1
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <body>
                <h2>Titles of all books:</h2>
                <ul>
                        <xsl:apply-templates/>
                </ul>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="bookShop/book">
            <li>
                <xsl:value-of select="title"/>
            </li>
    </xsl:template>

</xsl:stylesheet>
