package stateandbehavior;

import static org.junit.jupiter.api.Assertions.fail;
import static assertions.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import stateandbehavior.Location;


public class LocationTest {
  private Location location;
  
  @BeforeEach
  protected void setUp() {
    location = new Location();
    
  }
  
  @Test
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state(location);
    
  }
  
  @Test
  public void testLeft() {
    _transition_exprAction__left_transitions0_actions0(location);
    _test__left_transitions0_effects0_state(location);
    
  }
  
  @Test
  public void testRight() {
    _transition_exprAction__right_transitions0_actions0(location);
    _test__right_transitions0_effects0_state(location);
    
  }
  
  @Test
  public void testUp() {
    _transition_exprAction__up_transitions0_actions0(location);
    _test__up_transitions0_effects0_state(location);
    
  }
  
  @Test
  public void testNed() {
    _transition_exprAction__ned_transitions0_actions0(location);
    _test__ned_transitions0_effects0_state(location);
    
  }
  
  private void _test__constructor_transitions0_effects0_state(final Location it) {
    _test__constructor_transitions0_effects0_state_objectTests0_test(location);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final Location it) {
    
    int _x = it.getX();
    _assertEquals("x == 0 failed", 0, _x);
    
    int _y = it.getY();
    _assertEquals("y == 0 failed", 0, _y);
    
  }
  
  private void _transition_exprAction__left_transitions0_actions0(final Location it) {
    try {
      
      it.left();
      } catch (AssertionFailedError error) {
      fail("left failed: " + error.getMessage());
    }
    
  }
  
  private void _test__left_transitions0_effects0_state(final Location it) {
    _test__left_transitions0_effects0_state_objectTests0_test(location);
    
  }
  
  private void _test__left_transitions0_effects0_state_objectTests0_test(final Location it) {
    
    int _x = it.getX();
    _assertEquals("x == -1 failed after left", (-1), _x);
    
    int _y = it.getY();
    _assertEquals("y == 0 failed after left", 0, _y);
    
  }
  
  private void _transition_exprAction__right_transitions0_actions0(final Location it) {
    try {
      
      it.right();
      } catch (AssertionFailedError error) {
      fail("right failed: " + error.getMessage());
    }
    
  }
  
  private void _test__right_transitions0_effects0_state(final Location it) {
    _test__right_transitions0_effects0_state_objectTests0_test(location);
    
  }
  
  private void _test__right_transitions0_effects0_state_objectTests0_test(final Location it) {
    
    int _x = it.getX();
    _assertEquals("x == 1 failed after right", 1, _x);
    
    int _y = it.getY();
    _assertEquals("y == 0 failed after right", 0, _y);
    
  }
  
  private void _transition_exprAction__up_transitions0_actions0(final Location it) {
    try {
      
      it.up();
      } catch (AssertionFailedError error) {
      fail("up failed: " + error.getMessage());
    }
    
  }
  
  private void _test__up_transitions0_effects0_state(final Location it) {
    _test__up_transitions0_effects0_state_objectTests0_test(location);
    
  }
  
  private void _test__up_transitions0_effects0_state_objectTests0_test(final Location it) {
    
    int _x = it.getX();
    _assertEquals("x == 0 failed after up", 0, _x);
    
    int _y = it.getY();
    _assertEquals("y == -1 failed after up", (-1), _y);
    
  }
  
  private void _transition_exprAction__ned_transitions0_actions0(final Location it) {
    try {
      
      it.down();
      } catch (AssertionFailedError error) {
      fail("down failed: " + error.getMessage());
    }
    
  }
  
  private void _test__ned_transitions0_effects0_state(final Location it) {
    _test__ned_transitions0_effects0_state_objectTests0_test(location);
    
  }
  
  private void _test__ned_transitions0_effects0_state_objectTests0_test(final Location it) {
    
    int _x = it.getX();
    _assertEquals("x == 0 failed after down", 0, _x);
    
    int _y = it.getY();
    _assertEquals("y == 1 failed after down", 1, _y);
    
  }
}
