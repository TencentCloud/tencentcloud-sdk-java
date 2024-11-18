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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonExDescriptionInfo extends AbstractModel {

    /**
    * 人员描述字段Index，从0开始。
    */
    @SerializedName("PersonExDescriptionIndex")
    @Expose
    private Long PersonExDescriptionIndex;

    /**
    * 需要更新的人员描述字段内容。
    */
    @SerializedName("PersonExDescription")
    @Expose
    private String PersonExDescription;

    /**
     * Get 人员描述字段Index，从0开始。 
     * @return PersonExDescriptionIndex 人员描述字段Index，从0开始。
     */
    public Long getPersonExDescriptionIndex() {
        return this.PersonExDescriptionIndex;
    }

    /**
     * Set 人员描述字段Index，从0开始。
     * @param PersonExDescriptionIndex 人员描述字段Index，从0开始。
     */
    public void setPersonExDescriptionIndex(Long PersonExDescriptionIndex) {
        this.PersonExDescriptionIndex = PersonExDescriptionIndex;
    }

    /**
     * Get 需要更新的人员描述字段内容。 
     * @return PersonExDescription 需要更新的人员描述字段内容。
     */
    public String getPersonExDescription() {
        return this.PersonExDescription;
    }

    /**
     * Set 需要更新的人员描述字段内容。
     * @param PersonExDescription 需要更新的人员描述字段内容。
     */
    public void setPersonExDescription(String PersonExDescription) {
        this.PersonExDescription = PersonExDescription;
    }

    public PersonExDescriptionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonExDescriptionInfo(PersonExDescriptionInfo source) {
        if (source.PersonExDescriptionIndex != null) {
            this.PersonExDescriptionIndex = new Long(source.PersonExDescriptionIndex);
        }
        if (source.PersonExDescription != null) {
            this.PersonExDescription = new String(source.PersonExDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonExDescriptionIndex", this.PersonExDescriptionIndex);
        this.setParamSimple(map, prefix + "PersonExDescription", this.PersonExDescription);

    }
}

