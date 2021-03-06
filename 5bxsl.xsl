<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/1999/xhtml">
<xsl:template match="/student">
  <html>
  <body>
    <h2>Student Information</h2>
    <table border="1">
      <tr>
        <th>USN</th>
        <th>Name</th>
        <th>Name of the College</th>
        <th>Branch</th>
        <th>Year of Joining</th>
        <th>E-Mail</th>
      </tr>
      <xsl:for-each select="/student/std/std1">
       <tr>
          <td><xsl:value-of select="usn"/></td>
          <td><xsl:value-of select="name"/></td>
          <td><xsl:value-of select="college"/></td>
          <td><xsl:value-of select="branch"/></td>
          <td><xsl:value-of select="year"/></td>
          <td><xsl:value-of select="email"/></td>
      </tr>
    </xsl:for-each>
        <xsl:for-each select="/student/std/std2">
       <tr>
          <td><xsl:value-of select="usn"/></td>
          <td><xsl:value-of select="name"/></td>
          <td><xsl:value-of select="college"/></td>
          <td><xsl:value-of select="branch"/></td>
          <td><xsl:value-of select="year"/></td>
          <td><xsl:value-of select="email"/></td>
      </tr>
    </xsl:for-each>
        <xsl:for-each select="/student/std/std3">
       <tr>
          <td><xsl:value-of select="usn"/></td>
          <td><xsl:value-of select="name"/></td>
          <td><xsl:value-of select="college"/></td>
          <td><xsl:value-of select="branch"/></td>
          <td><xsl:value-of select="year"/></td>
          <td><xsl:value-of select="email"/></td>
 </tr>
    </xsl:for-each>

    </table>
  </body>
  </html>
  </xsl:template>
  </xsl:stylesheet>
 