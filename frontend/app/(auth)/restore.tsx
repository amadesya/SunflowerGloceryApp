import { Link, Stack } from "expo-router";
import { Text, View } from "react-native";

export default function Restore() {
    return (
        <View>
            <Stack.Screen options={{ title: 'Восстановить пароль' }} />
            <Link href={'/login'}>
                <Text>Восстановить</Text>
            </Link>
        </View>
    );
}