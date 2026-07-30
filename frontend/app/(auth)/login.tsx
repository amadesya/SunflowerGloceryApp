import { Link } from "expo-router";
import { Button, StyleSheet, Text, TextInput, View } from "react-native";

export default function Login() {
    return (
        <View style={styles.container}>
            <Text>Sunflower</Text>
            <View style={styles.form}>
                <TextInput style={styles.input} />
                <TextInput style={styles.input} />
                <Button title="Войти" />
                <Button title="Регистрация" />
            </View>
            <Link href={'/restore'}>
                <Text>Восстановить пароль</Text>
            </Link>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        justifyContent: 'center',
        flex: 1,
        padding: 55,
        backgroundColor: '#FDE2CD'
    },
    content: {
        alignItems: 'center',
        gap: 50
    },
    form: {
        alignSelf: 'stretch',
        gap: 16
    },
    input: {
        backgroundColor: '#FFF9F4'
    }
});
