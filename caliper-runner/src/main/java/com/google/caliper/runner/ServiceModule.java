/*
 * Copyright (C) 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.caliper.runner;

import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.ServiceManager;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Singleton;

/** Configures the {@link ServiceManager}. */
@Module
abstract class ServiceModule {
  private ServiceModule() {}

  @Provides
  @Singleton
  static ServiceManager provideServiceManager(Set<Service> services) {
    return new ServiceManager(services);
  }
}
