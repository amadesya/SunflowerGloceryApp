import { NativeModule, requireNativeModule } from 'expo';

declare class SunflowerAuthModule extends NativeModule<{}> {}

export default requireNativeModule<SunflowerAuthModule>('SunflowerAuth');
