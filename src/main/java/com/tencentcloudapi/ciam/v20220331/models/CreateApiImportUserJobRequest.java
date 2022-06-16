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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiImportUserJobRequest extends AbstractModel{

    /**
    * 用户目录ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 导入的用户数据
    */
    @SerializedName("DataFlowUserCreateList")
    @Expose
    private ImportUser [] DataFlowUserCreateList;

    /**
     * Get 用户目录ID 
     * @return UserStoreId 用户目录ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户目录ID
     * @param UserStoreId 用户目录ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 导入的用户数据 
     * @return DataFlowUserCreateList 导入的用户数据
     */
    public ImportUser [] getDataFlowUserCreateList() {
        return this.DataFlowUserCreateList;
    }

    /**
     * Set 导入的用户数据
     * @param DataFlowUserCreateList 导入的用户数据
     */
    public void setDataFlowUserCreateList(ImportUser [] DataFlowUserCreateList) {
        this.DataFlowUserCreateList = DataFlowUserCreateList;
    }

    public CreateApiImportUserJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiImportUserJobRequest(CreateApiImportUserJobRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.DataFlowUserCreateList != null) {
            this.DataFlowUserCreateList = new ImportUser[source.DataFlowUserCreateList.length];
            for (int i = 0; i < source.DataFlowUserCreateList.length; i++) {
                this.DataFlowUserCreateList[i] = new ImportUser(source.DataFlowUserCreateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamArrayObj(map, prefix + "DataFlowUserCreateList.", this.DataFlowUserCreateList);

    }
}

