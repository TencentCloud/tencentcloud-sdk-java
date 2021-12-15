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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUsersRequest extends AbstractModel{

    /**
    * 被删除用户的ID列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。
    */
    @SerializedName("DeleteIdList")
    @Expose
    private String [] DeleteIdList;

    /**
    * 被删除用户的名称列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。
    */
    @SerializedName("DeleteNameList")
    @Expose
    private String [] DeleteNameList;

    /**
     * Get 被删除用户的ID列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。 
     * @return DeleteIdList 被删除用户的ID列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。
     */
    public String [] getDeleteIdList() {
        return this.DeleteIdList;
    }

    /**
     * Set 被删除用户的ID列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。
     * @param DeleteIdList 被删除用户的ID列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。
     */
    public void setDeleteIdList(String [] DeleteIdList) {
        this.DeleteIdList = DeleteIdList;
    }

    /**
     * Get 被删除用户的名称列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。 
     * @return DeleteNameList 被删除用户的名称列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。
     */
    public String [] getDeleteNameList() {
        return this.DeleteNameList;
    }

    /**
     * Set 被删除用户的名称列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。
     * @param DeleteNameList 被删除用户的名称列表。DeleteIdList 和 DeleteNameList 需至少一个不为空；都不为空时优先使用 DeleteNameList。
     */
    public void setDeleteNameList(String [] DeleteNameList) {
        this.DeleteNameList = DeleteNameList;
    }

    public DeleteUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUsersRequest(DeleteUsersRequest source) {
        if (source.DeleteIdList != null) {
            this.DeleteIdList = new String[source.DeleteIdList.length];
            for (int i = 0; i < source.DeleteIdList.length; i++) {
                this.DeleteIdList[i] = new String(source.DeleteIdList[i]);
            }
        }
        if (source.DeleteNameList != null) {
            this.DeleteNameList = new String[source.DeleteNameList.length];
            for (int i = 0; i < source.DeleteNameList.length; i++) {
                this.DeleteNameList[i] = new String(source.DeleteNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeleteIdList.", this.DeleteIdList);
        this.setParamArraySimple(map, prefix + "DeleteNameList.", this.DeleteNameList);

    }
}

