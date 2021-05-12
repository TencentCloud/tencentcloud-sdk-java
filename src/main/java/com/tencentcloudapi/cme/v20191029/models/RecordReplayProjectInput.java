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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordReplayProjectInput extends AbstractModel{

    /**
    * 录制拉流地址。
    */
    @SerializedName("PullStreamUrl")
    @Expose
    private String PullStreamUrl;

    /**
    * 录制文件归属者。
    */
    @SerializedName("MaterialOwner")
    @Expose
    private Entity MaterialOwner;

    /**
    * 录制文件存储分类路径。
    */
    @SerializedName("MaterialClassPath")
    @Expose
    private String MaterialClassPath;

    /**
    * 回放推流地址。
    */
    @SerializedName("PushStreamUrl")
    @Expose
    private String PushStreamUrl;

    /**
     * Get 录制拉流地址。 
     * @return PullStreamUrl 录制拉流地址。
     */
    public String getPullStreamUrl() {
        return this.PullStreamUrl;
    }

    /**
     * Set 录制拉流地址。
     * @param PullStreamUrl 录制拉流地址。
     */
    public void setPullStreamUrl(String PullStreamUrl) {
        this.PullStreamUrl = PullStreamUrl;
    }

    /**
     * Get 录制文件归属者。 
     * @return MaterialOwner 录制文件归属者。
     */
    public Entity getMaterialOwner() {
        return this.MaterialOwner;
    }

    /**
     * Set 录制文件归属者。
     * @param MaterialOwner 录制文件归属者。
     */
    public void setMaterialOwner(Entity MaterialOwner) {
        this.MaterialOwner = MaterialOwner;
    }

    /**
     * Get 录制文件存储分类路径。 
     * @return MaterialClassPath 录制文件存储分类路径。
     */
    public String getMaterialClassPath() {
        return this.MaterialClassPath;
    }

    /**
     * Set 录制文件存储分类路径。
     * @param MaterialClassPath 录制文件存储分类路径。
     */
    public void setMaterialClassPath(String MaterialClassPath) {
        this.MaterialClassPath = MaterialClassPath;
    }

    /**
     * Get 回放推流地址。 
     * @return PushStreamUrl 回放推流地址。
     */
    public String getPushStreamUrl() {
        return this.PushStreamUrl;
    }

    /**
     * Set 回放推流地址。
     * @param PushStreamUrl 回放推流地址。
     */
    public void setPushStreamUrl(String PushStreamUrl) {
        this.PushStreamUrl = PushStreamUrl;
    }

    public RecordReplayProjectInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordReplayProjectInput(RecordReplayProjectInput source) {
        if (source.PullStreamUrl != null) {
            this.PullStreamUrl = new String(source.PullStreamUrl);
        }
        if (source.MaterialOwner != null) {
            this.MaterialOwner = new Entity(source.MaterialOwner);
        }
        if (source.MaterialClassPath != null) {
            this.MaterialClassPath = new String(source.MaterialClassPath);
        }
        if (source.PushStreamUrl != null) {
            this.PushStreamUrl = new String(source.PushStreamUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PullStreamUrl", this.PullStreamUrl);
        this.setParamObj(map, prefix + "MaterialOwner.", this.MaterialOwner);
        this.setParamSimple(map, prefix + "MaterialClassPath", this.MaterialClassPath);
        this.setParamSimple(map, prefix + "PushStreamUrl", this.PushStreamUrl);

    }
}

