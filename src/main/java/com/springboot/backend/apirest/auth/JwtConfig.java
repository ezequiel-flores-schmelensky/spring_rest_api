package com.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAu8/pepA6tRHVH+cWc8zQWrHTnItXs0HFeohpXmOazG+ebn0P\r\n" + 
			"0eo2IsoW2qJj3JotthIL0JFvi1gmRG2PtGwkynoO9YoOEwAb6ORihYqQLpuGGzEx\r\n" + 
			"vi5mQAPSZqNxkrq5UFwihySAV+c5t/EPTTaIjEZoFDiN1umlueZDnPodD9MoGHNm\r\n" + 
			"D6pKDWyWPI5UTpPApnGU7oT9Wt2eMlwp9GG0cDP8xPqpbJLBx1Ii+T4cgD+mBqOL\r\n" + 
			"E4uff0qFH0WYwbDZ+Ds9yuY1WwrkbFGI5qpYUgEpm0r2LLpAXsPppOm6JQXHs6Ed\r\n" + 
			"RLgv5SUEXJZb1mgk3qkDba1O05qR/Rc3SCdCewIDAQABAoIBADcwP1GOtFGk7dW0\r\n" + 
			"GDrrAobEHoSvxZOdTiRVlXDxH/nXCt04zr9GbaYHcHPKqEGY5LnNz774Haj6vDP7\r\n" + 
			"ZfEEnkMJXv/0E3Kt44WqJvFK6FdpyByRdiaGh/Fjrh4PBT6ys+XTTSodJcGu5p0Q\r\n" + 
			"rwhnb/SYc9kNTVDL07Eu4stsC8IsL0XQp4Oa77xEej6Yb5e5BTNX3+VJq7h16IDC\r\n" + 
			"4Ee1DA2djHulQ1vvcYvqzza+SIDt9Raw1RKhHbLp0QLfzimnQHv33uUoqd0BZjA2\r\n" + 
			"/OqclO0oglICR3lA7RvQ5ONujZw3TtinNCDRaY3mrjuhNOL6OqNBNGgM5NR5q+nN\r\n" + 
			"e0WdODECgYEA6gyZ+OF/sDQKsP1pPwhz6utWQ0RofZPwo9oS50k1EyPCjRTpSwZ6\r\n" + 
			"XV+d/+zyPA5Ao9a748NyRffpNHqAnTw390NvdHhAqgXbnouMnsyzXvkhv3N0dDKF\r\n" + 
			"/rTxTGQ7lvn7xg+rr/8Xjpb+bUWlD7X4L+AEhBIcWAbZw20vTd+de/8CgYEAzW0u\r\n" + 
			"1K10tLZCTdmF1A40gb1g/EDxBFyIM+wI6FjYaF5QfpY6snm7X5n5ReHRbhTOCUbu\r\n" + 
			"AsbwAOqG74qEk5o+cmp0tGK8vZXaO+L8n9nfKKXSNUuJEYzE9hGJOgBgEOSgT8Bu\r\n" + 
			"mNjDL/oOE2c9pYHw9YiFgJcuotJozQbw6QWGKYUCgYAdvcwzHDSlp3dUVl9xaxmP\r\n" + 
			"2Kf1lFPS4WHK8INGcL8V1415cBbVOdWC2Auz4eBGUWlVaIwnvUZgLcisqoR9dpGG\r\n" + 
			"EkOvgTh2Ypgt5X3RECIbB32KXpmFyoXMgCHJm1MXNF0SJhujGb9cl0Ntj1QSUwVe\r\n" + 
			"0BDC16pSZUx20QEZ3Die8QKBgFJUwgInCrEqouREm+hjURP2bJptBKu00jnNDbzh\r\n" + 
			"bspVknlJiHjjZP9p3Ifve1pdKD57mQSv6pzTYgU7ROtLVF/S3rc1I2PwXSjHTmxa\r\n" + 
			"i5/k5ZzKi0LnYkEkwhTm9ZmPp9iOzUShC4l89Is+Q2zD6WjesHLbJKvJHIufjoo1\r\n" + 
			"1pFpAoGBAIx1WY1TY/kQ4AntCuEgPq11w/Te28MDMVBoqhAm65cH+9/NhypjgQJj\r\n" + 
			"Y0d2WBr1t9E9nmpDxB/knr8xu9SirVEuqyxN/fg2DY5AOXaz3vHnStChAOkIj6t4\r\n" + 
			"pE284c3HOhEVBOwP+gjwZVMSQ61rYKUJhETP13ilf0Z5fG/RkJf+\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu8/pepA6tRHVH+cWc8zQ\r\n" + 
			"WrHTnItXs0HFeohpXmOazG+ebn0P0eo2IsoW2qJj3JotthIL0JFvi1gmRG2PtGwk\r\n" + 
			"ynoO9YoOEwAb6ORihYqQLpuGGzExvi5mQAPSZqNxkrq5UFwihySAV+c5t/EPTTaI\r\n" + 
			"jEZoFDiN1umlueZDnPodD9MoGHNmD6pKDWyWPI5UTpPApnGU7oT9Wt2eMlwp9GG0\r\n" + 
			"cDP8xPqpbJLBx1Ii+T4cgD+mBqOLE4uff0qFH0WYwbDZ+Ds9yuY1WwrkbFGI5qpY\r\n" + 
			"UgEpm0r2LLpAXsPppOm6JQXHs6EdRLgv5SUEXJZb1mgk3qkDba1O05qR/Rc3SCdC\r\n" + 
			"ewIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
