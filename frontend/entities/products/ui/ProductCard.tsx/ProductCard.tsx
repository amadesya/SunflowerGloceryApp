import { Button } from "@/shared/Button";
import { Chip } from "@/shared/Chip/Chip";
import { Colors, Radius } from "@/shared/tokens";
import { Image, StyleSheet, View } from "react-native";

export function ProductCard () {
    return <View>
        <Image
            source={require('@/assets/images/images.webp')}
            style = { styles.image }
            height = {200}
            resizeMode="contain"
         />
         <View style={styles.header}>
            <View style={styles.chips}>
                <Chip text="Помидоры" />
            </View>
         </View>

         <View style={styles.footer}>
            <Button title="Добавить в корзину"/>
        </View>
    
    </View>
}

const styles = StyleSheet.create({
    card: {
        flexDirection: 'column',
        borderRadius: Radius.r16,
        backgroundColor: Colors.white
    },
    image: {

    },
    title: {},
    chips: {},
    header: {},
    footer: {}
})