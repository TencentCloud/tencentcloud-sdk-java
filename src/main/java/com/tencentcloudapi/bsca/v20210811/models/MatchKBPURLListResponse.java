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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchKBPURLListResponse extends AbstractModel{

    /**
    * 组件列表。
    */
    @SerializedName("PURLList")
    @Expose
    private PURL [] PURLList;

    /**
    * 是否命中数据库。
    */
    @SerializedName("Hit")
    @Expose
    private Boolean Hit;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 组件列表。 
     * @return PURLList 组件列表。
     */
    public PURL [] getPURLList() {
        return this.PURLList;
    }

    /**
     * Set 组件列表。
     * @param PURLList 组件列表。
     */
    public void setPURLList(PURL [] PURLList) {
        this.PURLList = PURLList;
    }

    /**
     * Get 是否命中数据库。 
     * @return Hit 是否命中数据库。
     */
    public Boolean getHit() {
        return this.Hit;
    }

    /**
     * Set 是否命中数据库。
     * @param Hit 是否命中数据库。
     */
    public void setHit(Boolean Hit) {
        this.Hit = Hit;
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

    public MatchKBPURLListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchKBPURLListResponse(MatchKBPURLListResponse source) {
        if (source.PURLList != null) {
            this.PURLList = new PURL[source.PURLList.length];
            for (int i = 0; i < source.PURLList.length; i++) {
                this.PURLList[i] = new PURL(source.PURLList[i]);
            }
        }
        if (source.Hit != null) {
            this.Hit = new Boolean(source.Hit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PURLList.", this.PURLList);
        this.setParamSimple(map, prefix + "Hit", this.Hit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

