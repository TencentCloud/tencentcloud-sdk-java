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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetVolumeCommandInput extends AbstractModel{

    /**
    * 音量大小，取值范围为 0~100，默认值为 50。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
     * Get 音量大小，取值范围为 0~100，默认值为 50。 
     * @return Volume 音量大小，取值范围为 0~100，默认值为 50。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 音量大小，取值范围为 0~100，默认值为 50。
     * @param Volume 音量大小，取值范围为 0~100，默认值为 50。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    public SetVolumeCommandInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetVolumeCommandInput(SetVolumeCommandInput source) {
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

