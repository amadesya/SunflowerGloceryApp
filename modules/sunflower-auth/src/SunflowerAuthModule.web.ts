import { registerWebModule, NativeModule } from 'expo';

class SunflowerAuthModule extends NativeModule<{}> {}

export default registerWebModule(SunflowerAuthModule, 'SunflowerAuthModule');
