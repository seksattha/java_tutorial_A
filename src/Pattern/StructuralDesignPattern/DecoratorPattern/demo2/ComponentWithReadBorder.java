package Pattern.StructuralDesignPattern.DecoratorPattern.demo2;

import java.awt.*;

public class ComponentWithReadBorder implements Component {
    Component decoratedComponent;

    public ComponentWithReadBorder(Component component) {
        this.decoratedComponent = component;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);
        graphics.setColor(Color.black);
    }
}
