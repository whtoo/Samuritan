import scala.annotation.tailrec
import scala.util.matching.Regex.Match

7+2
def xd(x:Int,y:Int):Int = x + y
xd(12,12)
def identity[A](a:A) : A = a
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
  else n + fac(n-1)
}
fac(100)
fac(13)
def nextOption() : Int = if (util.Random.nextInt(100) > 0) 12 else -1
val a = nextOption
val b = nextOption

def firstCoins(kd:Int) : Int = kd match {
  case 1 => 1;//1美分
  case 2 => 5;//5美分
  case 3 => 10;//10美分
  case 4 => 25;//25美分
  case 5 => 50;//50美分
}
def cacLab(amount:Int,kds:Int) : Int @tailrec ={
  if(amount == 0) 1
  else if((amount < 0 ) || (kds == 0)) 0
  else (cacLab(amount,(kds -1)) + cacLab(amount - firstCoins(kds),kds))
}
cacLab(100,5)

def f(n:Int) : Int @tailrec = {
  if( n < 3) n
  else f(n-1) + 2 * f(n-2) + 3 * f(n-3)
}

f(5)




