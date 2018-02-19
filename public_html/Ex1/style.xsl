<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : style.xsl
    Created on : 5 de febrero de 2018, 13:00
    Author     : dam1
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 
    <xsl:template match="/">
        <html>
            <body>
                <table border="0">
                    <tr bgcolor="#84c165">
                        <th>Food Item</th>
                        <th>Carbs (g)</th>
                        <th>Fiber (g)</th>
                        <th>Fat (g)</th>
                        <th>Energy (kj)</th>
                    </tr>
                    <xsl:for-each select="food_list/food_item">
                        <tr bgcolor="#9fff80">
                            <td>
                                <xsl:value-of select="name"/>
                            </td>
                            <td>
                                <xsl:value-of select="carbs_per_serving"/>
                            </td>
                            <td>
                                <xsl:value-of select="fiber_per_serving"/>
                            </td>
                            <td>
                                <xsl:value-of select="fat_per_serving"/>
                            </td>
                            <td>
                                <xsl:value-of select="kj_per_serving"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
