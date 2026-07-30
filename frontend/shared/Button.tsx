import { Pressable, PressableProps, StyleSheet, Text, View } from "react-native";
import { Colors, Radius } from "./tokens";


export function Button ({title, ...props}: PressableProps & {title: string}){
    return (
        <Pressable
            style={styles.button}
            {...props}
        >
            <View>
                <Text style={styles.text}>{title}</Text>
            </View>
        </Pressable>
    )
}


const styles = StyleSheet.create({
    button:{
        justifyContent: 'center',
        alignItems: 'center',
        height: 58,
        backgroundColor: Colors.orange,
        paddingHorizontal: 24,
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