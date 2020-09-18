import org.scalatest.matchers.should.{Matchers}
import org.scalatest.propspec.{AnyPropSpec}
import org.scalatest.prop.{TableDrivenPropertyChecks}

import org.scalatest.concurrent.{Signaler, TimeLimitedTests}
import org.scalatest.time.SpanSugar._

abstract class UnitSpec
  extends AnyPropSpec
    with Matchers
    with TimeLimitedTests {
  def timeLimit = 1 second
  override val defaultTestSignaler = new Signaler {
    @deprecated("","")
    override def apply (testThread: Thread) : Unit = {
      println ("Too slow")
      testThread.stop () // deprecated. unsafe. do not use  
    }
  }
}
// with TableDriven
// with GeneratorDrivenPropertyChecks

// with Matchers
// with ShouldMatchers
// with OptionValues
// with Inside
// with Inspectors
