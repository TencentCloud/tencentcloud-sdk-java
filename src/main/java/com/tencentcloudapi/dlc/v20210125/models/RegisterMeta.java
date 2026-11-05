/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterMeta extends AbstractModel {

    /**
    * <p>Checkpoint 子路径不能为空</p>
    */
    @SerializedName("CheckpointSubPath")
    @Expose
    private String CheckpointSubPath;

    /**
    * <p>来源训练实例标识（接入方自定义语义，可选）</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>接入方扩展键值列表（原样落库，平台不解释）</p>
    */
    @SerializedName("Extras")
    @Expose
    private KVPair [] Extras;

    /**
     * Get <p>Checkpoint 子路径不能为空</p> 
     * @return CheckpointSubPath <p>Checkpoint 子路径不能为空</p>
     */
    public String getCheckpointSubPath() {
        return this.CheckpointSubPath;
    }

    /**
     * Set <p>Checkpoint 子路径不能为空</p>
     * @param CheckpointSubPath <p>Checkpoint 子路径不能为空</p>
     */
    public void setCheckpointSubPath(String CheckpointSubPath) {
        this.CheckpointSubPath = CheckpointSubPath;
    }

    /**
     * Get <p>来源训练实例标识（接入方自定义语义，可选）</p> 
     * @return InstanceId <p>来源训练实例标识（接入方自定义语义，可选）</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>来源训练实例标识（接入方自定义语义，可选）</p>
     * @param InstanceId <p>来源训练实例标识（接入方自定义语义，可选）</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>接入方扩展键值列表（原样落库，平台不解释）</p> 
     * @return Extras <p>接入方扩展键值列表（原样落库，平台不解释）</p>
     */
    public KVPair [] getExtras() {
        return this.Extras;
    }

    /**
     * Set <p>接入方扩展键值列表（原样落库，平台不解释）</p>
     * @param Extras <p>接入方扩展键值列表（原样落库，平台不解释）</p>
     */
    public void setExtras(KVPair [] Extras) {
        this.Extras = Extras;
    }

    public RegisterMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterMeta(RegisterMeta source) {
        if (source.CheckpointSubPath != null) {
            this.CheckpointSubPath = new String(source.CheckpointSubPath);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Extras != null) {
            this.Extras = new KVPair[source.Extras.length];
            for (int i = 0; i < source.Extras.length; i++) {
                this.Extras[i] = new KVPair(source.Extras[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckpointSubPath", this.CheckpointSubPath);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Extras.", this.Extras);

    }
}

