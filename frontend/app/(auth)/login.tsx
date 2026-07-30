import { Button } from "@/shared/Button";
import { Input } from "@/shared/Input";
import { Colors, FontSizes, Gaps } from "@/shared/tokens";
import { Link } from "expo-router";
import { Image, StyleSheet, Text, View } from "react-native";

export default function Login() {
    return (
        <View style={styles.container}>
            <View style={styles.content}>
                <Image
                    source={require('@/assets/images/sunflower.png')}
                    style={styles.logo}
                    resizeMode="contain"
                />
                <Text style={styles.header}>Вход</Text>
                <View style={styles.form}>
                    <Input placeholder="Введите email" />
                    <Input isPassword placeholder="Введите пароль"/>
                    <Link href={'/restore'}>
                        <Text>Забыли пароль?</Text>
                    </Link>
                    <Button title="Войти" />
                    <Button title="Регистрация" />
                </View>
            </View>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        justifyContent: 'center',
        flex: 1,
        padding: 55,
        backgroundColor: Colors.beige
    },
    logo: {
        width: 150,
        height: 150,
        alignSelf: 'center'
    },
    content: {
        alignItems: 'center',
        gap: Gaps.g25
    },
    form: {
        alignSelf: 'stretch',
        gap: Gaps.g16
    },
    header:{
        fontSize: FontSizes.f24,
        fontWeight: 'bold',
        color: Colors.brown
    }
});
