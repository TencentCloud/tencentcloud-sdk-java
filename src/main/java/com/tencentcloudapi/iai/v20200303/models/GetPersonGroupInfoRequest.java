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

public class GetPersonGroupInfoRequest extends AbstractModel {

    /**
    * 人员ID，取值为创建人员接口中的PersonId。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 起始序号，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认值为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 人员ID，取值为创建人员接口中的PersonId。 
     * @return PersonId 人员ID，取值为创建人员接口中的PersonId。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，取值为创建人员接口中的PersonId。
     * @param PersonId 人员ID，取值为创建人员接口中的PersonId。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 起始序号，默认值为0。 
     * @return Offset 起始序号，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始序号，默认值为0。
     * @param Offset 起始序号，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为10，最大值为100。 
     * @return Limit 返回数量，默认值为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为10，最大值为100。
     * @param Limit 返回数量，默认值为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public GetPersonGroupInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPersonGroupInfoRequest(GetPersonGroupInfoRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

