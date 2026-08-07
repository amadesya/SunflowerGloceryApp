import { StyleSheet, View } from 'react-native';

import { Gaps } from "@/shared/tokens";

import { ProductCard } from '@/entities/products/ui/ProductCard.tsx/ProductCard';

export default function Profile() {
    // const [profile] = useAtom(profileAtom);

    // const login = async () => {
    //     try {
    //         const { data } = await axios.post(API.login, {
    //             email: 'test@example.com',
    //             password: 'password',
    //         });
    //         console.log(data);
    //     } catch (error) {
    //         console.error('Login failed:', error);
    //     }
    // };

    // useEffect(() => {
    //     login();
    // }, []);

    return (
        <View style={styles.wrapper}>
            <ProductCard/>
        </View>
    );
}

const styles = StyleSheet.create({
    wrapper:{
        flexDirection: 'column',
        gap: Gaps.g25,
        padding: 20
    }
})