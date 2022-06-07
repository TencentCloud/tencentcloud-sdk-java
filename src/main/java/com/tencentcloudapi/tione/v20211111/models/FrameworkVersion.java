/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrameworkVersion extends AbstractModel{

    /**
    * 框架版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 训练模式
    */
    @SerializedName("TrainingModes")
    @Expose
    private String [] TrainingModes;

    /**
     * Get 框架版本 
     * @return Version 框架版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 框架版本
     * @param Version 框架版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 训练模式 
     * @return TrainingModes 训练模式
     */
    public String [] getTrainingModes() {
        return this.TrainingModes;
    }

    /**
     * Set 训练模式
     * @param TrainingModes 训练模式
     */
    public void setTrainingModes(String [] TrainingModes) {
        this.TrainingModes = TrainingModes;
    }

    public FrameworkVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameworkVersion(FrameworkVersion source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.TrainingModes != null) {
            this.TrainingModes = new String[source.TrainingModes.length];
            for (int i = 0; i < source.TrainingModes.length; i++) {
                this.TrainingModes[i] = new String(source.TrainingModes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArraySimple(map, prefix + "TrainingModes.", this.TrainingModes);

    }
}

