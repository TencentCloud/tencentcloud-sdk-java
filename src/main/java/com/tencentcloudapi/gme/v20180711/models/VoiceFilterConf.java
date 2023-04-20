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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceFilterConf extends AbstractModel{

    /**
    * 语音过滤服务开关，取值：open/close
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 场景配置信息，如开关状态，回调地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneInfos")
    @Expose
    private SceneInfo [] SceneInfos;

    /**
     * Get 语音过滤服务开关，取值：open/close 
     * @return Status 语音过滤服务开关，取值：open/close
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 语音过滤服务开关，取值：open/close
     * @param Status 语音过滤服务开关，取值：open/close
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 场景配置信息，如开关状态，回调地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneInfos 场景配置信息，如开关状态，回调地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SceneInfo [] getSceneInfos() {
        return this.SceneInfos;
    }

    /**
     * Set 场景配置信息，如开关状态，回调地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneInfos 场景配置信息，如开关状态，回调地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneInfos(SceneInfo [] SceneInfos) {
        this.SceneInfos = SceneInfos;
    }

    public VoiceFilterConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceFilterConf(VoiceFilterConf source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SceneInfos != null) {
            this.SceneInfos = new SceneInfo[source.SceneInfos.length];
            for (int i = 0; i < source.SceneInfos.length; i++) {
                this.SceneInfos[i] = new SceneInfo(source.SceneInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "SceneInfos.", this.SceneInfos);

    }
}

