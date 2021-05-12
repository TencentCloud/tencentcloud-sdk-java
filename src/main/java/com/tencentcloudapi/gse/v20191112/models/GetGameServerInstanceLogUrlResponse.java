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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetGameServerInstanceLogUrlResponse extends AbstractModel{

    /**
    * 日志下载URL的数组，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresignedUrls")
    @Expose
    private String [] PresignedUrls;

    /**
    * 总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 是否还有没拉取完的
    */
    @SerializedName("HasNext")
    @Expose
    private Boolean HasNext;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志下载URL的数组，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresignedUrls 日志下载URL的数组，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPresignedUrls() {
        return this.PresignedUrls;
    }

    /**
     * Set 日志下载URL的数组，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresignedUrls 日志下载URL的数组，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresignedUrls(String [] PresignedUrls) {
        this.PresignedUrls = PresignedUrls;
    }

    /**
     * Get 总条数 
     * @return Total 总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条数
     * @param Total 总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 是否还有没拉取完的 
     * @return HasNext 是否还有没拉取完的
     */
    public Boolean getHasNext() {
        return this.HasNext;
    }

    /**
     * Set 是否还有没拉取完的
     * @param HasNext 是否还有没拉取完的
     */
    public void setHasNext(Boolean HasNext) {
        this.HasNext = HasNext;
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

    public GetGameServerInstanceLogUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetGameServerInstanceLogUrlResponse(GetGameServerInstanceLogUrlResponse source) {
        if (source.PresignedUrls != null) {
            this.PresignedUrls = new String[source.PresignedUrls.length];
            for (int i = 0; i < source.PresignedUrls.length; i++) {
                this.PresignedUrls[i] = new String(source.PresignedUrls[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.HasNext != null) {
            this.HasNext = new Boolean(source.HasNext);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PresignedUrls.", this.PresignedUrls);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "HasNext", this.HasNext);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

