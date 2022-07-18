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

public class DeleteTrainingModelVersionRequest extends AbstractModel{

    /**
    * 模型版本ID
    */
    @SerializedName("TrainingModelVersionId")
    @Expose
    private String TrainingModelVersionId;

    /**
    * 是否同步清理cos
    */
    @SerializedName("EnableDeleteCos")
    @Expose
    private Boolean EnableDeleteCos;

    /**
     * Get 模型版本ID 
     * @return TrainingModelVersionId 模型版本ID
     */
    public String getTrainingModelVersionId() {
        return this.TrainingModelVersionId;
    }

    /**
     * Set 模型版本ID
     * @param TrainingModelVersionId 模型版本ID
     */
    public void setTrainingModelVersionId(String TrainingModelVersionId) {
        this.TrainingModelVersionId = TrainingModelVersionId;
    }

    /**
     * Get 是否同步清理cos 
     * @return EnableDeleteCos 是否同步清理cos
     */
    public Boolean getEnableDeleteCos() {
        return this.EnableDeleteCos;
    }

    /**
     * Set 是否同步清理cos
     * @param EnableDeleteCos 是否同步清理cos
     */
    public void setEnableDeleteCos(Boolean EnableDeleteCos) {
        this.EnableDeleteCos = EnableDeleteCos;
    }

    public DeleteTrainingModelVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTrainingModelVersionRequest(DeleteTrainingModelVersionRequest source) {
        if (source.TrainingModelVersionId != null) {
            this.TrainingModelVersionId = new String(source.TrainingModelVersionId);
        }
        if (source.EnableDeleteCos != null) {
            this.EnableDeleteCos = new Boolean(source.EnableDeleteCos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrainingModelVersionId", this.TrainingModelVersionId);
        this.setParamSimple(map, prefix + "EnableDeleteCos", this.EnableDeleteCos);

    }
}

