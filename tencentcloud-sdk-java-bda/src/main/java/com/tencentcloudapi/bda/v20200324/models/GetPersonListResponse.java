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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPersonListResponse extends AbstractModel{

    /**
    * 返回的人员信息。
    */
    @SerializedName("PersonInfos")
    @Expose
    private PersonInfo [] PersonInfos;

    /**
    * 该人体库的人员数量。
    */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
    * 人体识别所用的算法模型版本。
    */
    @SerializedName("BodyModelVersion")
    @Expose
    private String BodyModelVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的人员信息。 
     * @return PersonInfos 返回的人员信息。
     */
    public PersonInfo [] getPersonInfos() {
        return this.PersonInfos;
    }

    /**
     * Set 返回的人员信息。
     * @param PersonInfos 返回的人员信息。
     */
    public void setPersonInfos(PersonInfo [] PersonInfos) {
        this.PersonInfos = PersonInfos;
    }

    /**
     * Get 该人体库的人员数量。 
     * @return PersonNum 该人体库的人员数量。
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * Set 该人体库的人员数量。
     * @param PersonNum 该人体库的人员数量。
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
    }

    /**
     * Get 人体识别所用的算法模型版本。 
     * @return BodyModelVersion 人体识别所用的算法模型版本。
     */
    public String getBodyModelVersion() {
        return this.BodyModelVersion;
    }

    /**
     * Set 人体识别所用的算法模型版本。
     * @param BodyModelVersion 人体识别所用的算法模型版本。
     */
    public void setBodyModelVersion(String BodyModelVersion) {
        this.BodyModelVersion = BodyModelVersion;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PersonInfos.", this.PersonInfos);
        this.setParamSimple(map, prefix + "PersonNum", this.PersonNum);
        this.setParamSimple(map, prefix + "BodyModelVersion", this.BodyModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

