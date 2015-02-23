import scala.annotation.tailrec

7+2
def xd(x:Int,y:Int):Int = x + y
xd(12,12)
def idententy[A](a:A) : A = a
val s: String = identity("DC")
val d: Double = identity(21.1)
def cX(ch:Char):Boolean =
  if(ch == 'x') return true
  else false
cX('X')
cX('x')
"cxpcX".filter(w => cX(w))


def fac(n:Int):Int @tailrec = {
  if(n == 1) 1
  else n * fac(n-1)
}
fac(13)







