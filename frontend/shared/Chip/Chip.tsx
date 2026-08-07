import { StyleSheet, Text, View } from "react-native";
import { Colors, Fonts, FontSizes, Radius } from "../tokens";

export function Chip({ text }: { text: string }) {
    return <View style={styles.container}>
        <Text style={styles.text}>{text}</Text>
    </View>
}

const styles = StyleSheet.create({
    container:{
        paddingVertical: 5,
        paddingHorizontal: 10,
        borderColor: Colors.yellow,
        borderWidth: 1,
        borderRadius: Radius.r16
    },
    text:{
        fontFamily: Fonts.regular,
        fontSize: FontSizes.f16,
        color: Colors.brown
    },
});