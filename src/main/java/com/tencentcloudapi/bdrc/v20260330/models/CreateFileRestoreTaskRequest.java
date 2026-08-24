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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileRestoreTaskRequest extends AbstractModel {

    /**
    * 冲突处理策略：skip-跳过/"         "overwrite-覆盖/newer-保留较新的版本/"         "if_changed-内容变化时覆盖，默认overwrite
    */
    @SerializedName("ConflictStrategy")
    @Expose
    private String ConflictStrategy;

    /**
     * Get 冲突处理策略：skip-跳过/"         "overwrite-覆盖/newer-保留较新的版本/"         "if_changed-内容变化时覆盖，默认overwrite 
     * @return ConflictStrategy 冲突处理策略：skip-跳过/"         "overwrite-覆盖/newer-保留较新的版本/"         "if_changed-内容变化时覆盖，默认overwrite
     */
    public String getConflictStrategy() {
        return this.ConflictStrategy;
    }

    /**
     * Set 冲突处理策略：skip-跳过/"         "overwrite-覆盖/newer-保留较新的版本/"         "if_changed-内容变化时覆盖，默认overwrite
     * @param ConflictStrategy 冲突处理策略：skip-跳过/"         "overwrite-覆盖/newer-保留较新的版本/"         "if_changed-内容变化时覆盖，默认overwrite
     */
    public void setConflictStrategy(String ConflictStrategy) {
        this.ConflictStrategy = ConflictStrategy;
    }

    public CreateFileRestoreTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileRestoreTaskRequest(CreateFileRestoreTaskRequest source) {
        if (source.ConflictStrategy != null) {
            this.ConflictStrategy = new String(source.ConflictStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConflictStrategy", this.ConflictStrategy);

    }
}

