import { useEffect, useState } from "react";
import { Dimensions, StyleSheet, Text, View } from "react-native";
import { ErrorNotificationProps } from "./ErrorNotificationProps";
import { Colors, FontSizes } from "./tokens";

export function ErrorNotification({ error }: ErrorNotificationProps ){
        const [isShown, setIsShown] = useState<boolean>(false);

        useEffect(() => {
            if (!error) {
                return;
            }
            setIsShown(true);
            const timerId = setTimeout(() => {
                setIsShown(false);
            }, 3000);
            return () => {
                clearTimeout(timerId);
            }
        }, [error])
        
        if (!isShown) {
            return <></>
        }

        return (
        <View style={styles.error}>
            <Text style={styles.errorText}>{error}</Text>
        </View>
        );
        

}

const styles = StyleSheet.create({
    error: {
        position: 'absolute',
        top: 0,
        left: 0,
        width: Dimensions.get('window').width,
        backgroundColor: Colors.red,
        padding: 15,
    },
    errorText: {
        color: Colors.white,
        fontSize: FontSizes.f16,
        textAlign: 'center'
    }
})