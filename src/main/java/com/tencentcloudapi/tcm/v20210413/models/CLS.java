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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLS extends AbstractModel {

    /**
    * 是否启用
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 日志集
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * 日志主题
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 是否删除
    */
    @SerializedName("NeedDelete")
    @Expose
    private Boolean NeedDelete;

    /**
    * cls 主题创建的地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 是否启用 
     * @return Enable 是否启用
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用
     * @param Enable 是否启用
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 日志集 
     * @return LogSet 日志集
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set 日志集
     * @param LogSet 日志集
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get 日志主题 
     * @return Topic 日志主题
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 日志主题
     * @param Topic 日志主题
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 是否删除 
     * @return NeedDelete 是否删除
     */
    public Boolean getNeedDelete() {
        return this.NeedDelete;
    }

    /**
     * Set 是否删除
     * @param NeedDelete 是否删除
     */
    public void setNeedDelete(Boolean NeedDelete) {
        this.NeedDelete = NeedDelete;
    }

    /**
     * Get cls 主题创建的地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region cls 主题创建的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cls 主题创建的地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region cls 主题创建的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public CLS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLS(CLS source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.NeedDelete != null) {
            this.NeedDelete = new Boolean(source.NeedDelete);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "NeedDelete", this.NeedDelete);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

