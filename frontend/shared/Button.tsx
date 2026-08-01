import { Animated, GestureResponderEvent, Pressable, PressableProps, StyleSheet, Text } from "react-native";
import { Colors, Radius } from "./tokens";


export function Button ({title, ...props}: PressableProps & {title: string}){
    const animatedValue = new Animated.Value(100);
    const color = animatedValue.interpolate({
        inputRange: [0, 100],
        outputRange: [Colors.primaryHover, Colors.primary]
    })


    const fadeIn = (e: GestureResponderEvent) => {
        Animated.timing(animatedValue, {
            toValue: 0,
            duration: 100,
            useNativeDriver: false
        }).start();
        props.onPressIn && props.onPressIn(e);
    }

    const fadeOut = (e: GestureResponderEvent) => {
        Animated.timing(animatedValue, {
            toValue: 100,
            duration: 100,
            useNativeDriver: false
        }).start();
        props.onPressOut && props.onPressOut(e);
    }

    return (
        <Pressable
            style={styles.button}
            {...props}
            onPressIn={fadeIn}
            onPressOut={fadeOut}
        >
            <Animated.View style={{...styles.button, backgroundColor: color}}>
                <Text style={styles.text}>{title}</Text>
            </Animated.View>
        </Pressable>
    )
}


const styles = StyleSheet.create({
    button:{
        justifyContent: 'center',
        alignItems: 'stretch',
        height: 58,
        paddingVertical: 16,
        borderRadius: Radius.r25
    },
    text:{
        color: Colors.white,
        fontSize: 16,
        fontWeight: 'bold',
        textAlign: 'center'
    }
})