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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogTopics extends AbstractModel{

    /**
    * 多日志主题检索对应的错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private SearchLogErrors [] Errors;

    /**
    * 多日志主题检索各日志主题信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Infos")
    @Expose
    private SearchLogInfos [] Infos;

    /**
     * Get 多日志主题检索对应的错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors 多日志主题检索对应的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchLogErrors [] getErrors() {
        return this.Errors;
    }

    /**
     * Set 多日志主题检索对应的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors 多日志主题检索对应的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(SearchLogErrors [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get 多日志主题检索各日志主题信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Infos 多日志主题检索各日志主题信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchLogInfos [] getInfos() {
        return this.Infos;
    }

    /**
     * Set 多日志主题检索各日志主题信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Infos 多日志主题检索各日志主题信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfos(SearchLogInfos [] Infos) {
        this.Infos = Infos;
    }

    public SearchLogTopics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogTopics(SearchLogTopics source) {
        if (source.Errors != null) {
            this.Errors = new SearchLogErrors[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new SearchLogErrors(source.Errors[i]);
            }
        }
        if (source.Infos != null) {
            this.Infos = new SearchLogInfos[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new SearchLogInfos(source.Infos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);

    }
}

