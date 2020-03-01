package stateandbehavior;

import static org.junit.jupiter.api.Assertions.fail;

import com.google.common.base.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import static assertions.Assertions.*;

import stateandbehavior.LineEditor;

public class LineEditorTest{
  private LineEditor lineEditor;
  
  @BeforeEach
  protected void setUp() {
    lineEditor = new LineEditor();
    
  }
  
  private void set(final String s) {
    final int pos = s.indexOf("|");
    String _substring = s.substring(0, pos);
    String _substring_1 = s.substring((pos + 1));
    String _plus = (_substring + _substring_1);
    this.lineEditor.setText(_plus);
    this.lineEditor.setInsertionIndex(pos);
  }
  
  private boolean operator_equals(final LineEditor lineEditor, final String s) {
    boolean _xblockexpression = false;
    {
      final int pos = s.indexOf("|");
      final String head = s.substring(0, pos);
      String _xifexpression = null;
      int _length = s.length();
      boolean _lessThan = ((pos + 1) < _length);
      if (_lessThan) {
        _xifexpression = s.substring((pos + 1));
      } else {
        _xifexpression = "";
      }
      final String tail = _xifexpression;
      _xblockexpression = (Objects.equal(lineEditor.getText(), (head + tail)) && (lineEditor.getInsertionIndex() == pos));
    }
    return _xblockexpression;
  }
  
  @Test
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state(lineEditor);
    
  }
  
  @Test
  public void testLeft() {
    _transition_exprAction__left_transitions0_actions0(lineEditor);
    _test__left_transitions0_effects0_state(lineEditor);
    _transition_exprAction__left_transitions1_actions0(lineEditor);
    _transition_exprAction__left_transitions1_actions1(lineEditor);
    _test__left_transitions1_effects0_state(lineEditor);
    
  }
  
  @Test
  public void testRight() {
    _transition_exprAction__right_transitions0_actions0(lineEditor);
    _test__right_transitions0_effects0_state(lineEditor);
    _transition_exprAction__right_transitions1_actions0(lineEditor);
    _transition_exprAction__right_transitions1_actions1(lineEditor);
    _test__right_transitions1_effects0_state(lineEditor);
    
  }
  
  @Test
  public void testDeleteLeft() {
    _transition_exprAction__deleteLeft_transitions0_actions0(lineEditor);
    _test__deleteLeft_transitions0_effects0_state(lineEditor);
    _transition_exprAction__deleteLeft_transitions1_actions0(lineEditor);
    _transition_exprAction__deleteLeft_transitions1_actions1(lineEditor);
    _test__deleteLeft_transitions1_effects0_state(lineEditor);
    _transition_exprAction__deleteLeft_transitions2_actions0(lineEditor);
    _transition_exprAction__deleteLeft_transitions2_actions1(lineEditor);
    _test__deleteLeft_transitions2_effects0_state(lineEditor);
    
  }
  
  @Test
  public void testDeleteRight() {
    _transition_exprAction__deleteRight_transitions0_actions0(lineEditor);
    _test__deleteRight_transitions0_effects0_state(lineEditor);
    _transition_exprAction__deleteRight_transitions1_actions0(lineEditor);
    _transition_exprAction__deleteRight_transitions1_actions1(lineEditor);
    _test__deleteRight_transitions1_effects0_state(lineEditor);
    _transition_exprAction__deleteRight_transitions2_actions0(lineEditor);
    _transition_exprAction__deleteRight_transitions2_actions1(lineEditor);
    _test__deleteRight_transitions2_effects0_state(lineEditor);
    
  }
  
  @Test
  public void testInsertString() {
    _transition_exprAction__insertString_transitions0_actions0(lineEditor);
    _test__insertString_transitions0_effects0_state(lineEditor);
    _transition_exprAction__insertString_transitions1_actions0(lineEditor);
    _test__insertString_transitions1_effects0_state(lineEditor);
    _transition_exprAction__insertString_transitions2_actions0(lineEditor);
    _test__insertString_transitions2_effects0_state(lineEditor);
    _transition_exprAction__insertString_transitions3_actions0(lineEditor);
    _transition_exprAction__insertString_transitions3_actions1(lineEditor);
    _test__insertString_transitions3_effects0_state(lineEditor);
    _transition_exprAction__insertString_transitions4_actions0(lineEditor);
    _transition_exprAction__insertString_transitions4_actions1(lineEditor);
    _test__insertString_transitions4_effects0_state(lineEditor);
    
  }
  
  private void _test__constructor_transitions0_effects0_state(final LineEditor it) {
    _test__constructor_transitions0_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it ==\"|\" failed", this.operator_equals(it, "|"));
    
  }
  
  private void _transition_exprAction__left_transitions0_actions0(final LineEditor it) {
    try {
      
      it.left();
      } catch (AssertionFailedError error) {
      fail("left failed: " + error.getMessage());
    }
    
  }
  
  private void _test__left_transitions0_effects0_state(final LineEditor it) {
    _test__left_transitions0_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__left_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"|\" failed after left", this.operator_equals(it, "|"));
    
  }
  
  private void _transition_exprAction__left_transitions1_actions0(final LineEditor it) {
    try {
      
      this.set("J|");
      } catch (AssertionFailedError error) {
      fail("set(\"J|\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__left_transitions1_actions1(final LineEditor it) {
    try {
      
      it.left();
      } catch (AssertionFailedError error) {
      fail("left failed: " + error.getMessage());
    }
    
  }
  
  private void _test__left_transitions1_effects0_state(final LineEditor it) {
    _test__left_transitions1_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__left_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"|J\" failed after set(\"J|\") ,left", this.operator_equals(it, "|J"));
    
  }
  
  private void _transition_exprAction__right_transitions0_actions0(final LineEditor it) {
    try {
      
      it.right();
      } catch (AssertionFailedError error) {
      fail("right failed: " + error.getMessage());
    }
    
  }
  
  private void _test__right_transitions0_effects0_state(final LineEditor it) {
    _test__right_transitions0_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__right_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"|\" failed after right", this.operator_equals(it, "|"));
    
  }
  
  private void _transition_exprAction__right_transitions1_actions0(final LineEditor it) {
    try {
      
      this.set("|J");
      } catch (AssertionFailedError error) {
      fail("set(\"|J\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__right_transitions1_actions1(final LineEditor it) {
    try {
      
      it.right();
      } catch (AssertionFailedError error) {
      fail("right failed: " + error.getMessage());
    }
    
  }
  
  private void _test__right_transitions1_effects0_state(final LineEditor it) {
    _test__right_transitions1_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__right_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"J|\" failed after set(\"|J\") ,right", this.operator_equals(it, "J|"));
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions0_actions0(final LineEditor it) {
    try {
      
      it.deleteLeft();
      } catch (AssertionFailedError error) {
      fail("deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteLeft_transitions0_effects0_state(final LineEditor it) {
    _test__deleteLeft_transitions0_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteLeft_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"|\" failed after deleteLeft", this.operator_equals(it, "|"));
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions1_actions0(final LineEditor it) {
    try {
      
      this.set("J|");
      } catch (AssertionFailedError error) {
      fail("set(\"J|\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions1_actions1(final LineEditor it) {
    try {
      
      it.deleteLeft();
      } catch (AssertionFailedError error) {
      fail("deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteLeft_transitions1_effects0_state(final LineEditor it) {
    _test__deleteLeft_transitions1_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteLeft_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"|\" failed after set(\"J|\") ,deleteLeft", this.operator_equals(it, "|"));
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions2_actions0(final LineEditor it) {
    try {
      
      this.set("Ja|va");
      } catch (AssertionFailedError error) {
      fail("set(\"Ja|va\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions2_actions1(final LineEditor it) {
    try {
      
      it.deleteLeft();
      } catch (AssertionFailedError error) {
      fail("deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteLeft_transitions2_effects0_state(final LineEditor it) {
    _test__deleteLeft_transitions2_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteLeft_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"J|va\" failed after set(\"Ja|va\") ,deleteLeft", this.operator_equals(it, "J|va"));
    
  }
  
  private void _transition_exprAction__deleteRight_transitions0_actions0(final LineEditor it) {
    try {
      
      it.deleteRight();
      } catch (AssertionFailedError error) {
      fail("deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteRight_transitions0_effects0_state(final LineEditor it) {
    _test__deleteRight_transitions0_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteRight_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"|\" failed after deleteRight", this.operator_equals(it, "|"));
    
  }
  
  private void _transition_exprAction__deleteRight_transitions1_actions0(final LineEditor it) {
    try {
      
      this.set("|J");
      } catch (AssertionFailedError error) {
      fail("set(\"|J\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions1_actions1(final LineEditor it) {
    try {
      
      it.deleteRight();
      } catch (AssertionFailedError error) {
      fail("deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteRight_transitions1_effects0_state(final LineEditor it) {
    _test__deleteRight_transitions1_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteRight_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"|\" failed after set(\"|J\") ,deleteRight", this.operator_equals(it, "|"));
    
  }
  
  private void _transition_exprAction__deleteRight_transitions2_actions0(final LineEditor it) {
    try {
      
      this.set("J|ava");
      } catch (AssertionFailedError error) {
      fail("set(\"J|ava\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions2_actions1(final LineEditor it) {
    try {
      
      it.deleteRight();
      } catch (AssertionFailedError error) {
      fail("deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteRight_transitions2_effects0_state(final LineEditor it) {
    _test__deleteRight_transitions2_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteRight_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"J|va\" failed after set(\"J|ava\") ,deleteRight", this.operator_equals(it, "J|va"));
    
  }
  
  private void _transition_exprAction__insertString_transitions0_actions0(final LineEditor it) {
    try {
      
      it.insertString("");
      } catch (AssertionFailedError error) {
      fail("insertString(\"\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions0_effects0_state(final LineEditor it) {
    _test__insertString_transitions0_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"|\" failed after insertString(\"\")", this.operator_equals(it, "|"));
    
  }
  
  private void _transition_exprAction__insertString_transitions1_actions0(final LineEditor it) {
    try {
      
      it.insertString("Java");
      } catch (AssertionFailedError error) {
      fail("insertString(\"Java\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions1_effects0_state(final LineEditor it) {
    _test__insertString_transitions1_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"Java|\" failed after insertString(\"Java\")", this.operator_equals(it, "Java|"));
    
  }
  
  private void _transition_exprAction__insertString_transitions2_actions0(final LineEditor it) {
    try {
      
      it.insertString(" er g\u00F8y!");
      } catch (AssertionFailedError error) {
      fail("insertString(\" er gøy!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions2_effects0_state(final LineEditor it) {
    _test__insertString_transitions2_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"Java er gøy!|\" failed after insertString(\" er gøy!\")", this.operator_equals(it, "Java er g\u00F8y!|"));
    
  }
  
  private void _transition_exprAction__insertString_transitions3_actions0(final LineEditor it) {
    try {
      
      this.set("Java|g\u00F8y!");
      } catch (AssertionFailedError error) {
      fail("set(\"Java|gøy!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertString_transitions3_actions1(final LineEditor it) {
    try {
      
      it.insertString(" er ");
      } catch (AssertionFailedError error) {
      fail("insertString(\" er \") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions3_effects0_state(final LineEditor it) {
    _test__insertString_transitions3_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions3_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"Java er |gøy!\" failed after set(\"Java|gøy!\") ,insertString(\" er \")", this.operator_equals(it, "Java er |g\u00F8y!"));
    
  }
  
  private void _transition_exprAction__insertString_transitions4_actions0(final LineEditor it) {
    try {
      
      this.set("|er g\u00F8y!");
      } catch (AssertionFailedError error) {
      fail("set(\"|er gøy!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertString_transitions4_actions1(final LineEditor it) {
    try {
      
      it.insertString("Java ");
      } catch (AssertionFailedError error) {
      fail("insertString(\"Java \") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions4_effects0_state(final LineEditor it) {
    _test__insertString_transitions4_effects0_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions4_effects0_state_objectTests0_test(final LineEditor it) {
    
    _assertTrue("it == \"Java |er gøy!\" failed after set(\"|er gøy!\") ,insertString(\"Java \")", this.operator_equals(it, "Java |er g\u00F8y!"));
    
  }
}
