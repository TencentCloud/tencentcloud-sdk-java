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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackUpJobDetailResponse extends AbstractModel {

    /**
    * 备份表详情
    */
    @SerializedName("TableContents")
    @Expose
    private BackupTableContent [] TableContents;

    /**
    * 错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 是否是未知版本
    */
    @SerializedName("IsUnknownVersion")
    @Expose
    private Boolean IsUnknownVersion;

    /**
    * 返回对象用字符串表示
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份表详情 
     * @return TableContents 备份表详情
     */
    public BackupTableContent [] getTableContents() {
        return this.TableContents;
    }

    /**
     * Set 备份表详情
     * @param TableContents 备份表详情
     */
    public void setTableContents(BackupTableContent [] TableContents) {
        this.TableContents = TableContents;
    }

    /**
     * Get 错误信息 
     * @return ErrorMsg 错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息
     * @param ErrorMsg 错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 是否是未知版本 
     * @return IsUnknownVersion 是否是未知版本
     */
    public Boolean getIsUnknownVersion() {
        return this.IsUnknownVersion;
    }

    /**
     * Set 是否是未知版本
     * @param IsUnknownVersion 是否是未知版本
     */
    public void setIsUnknownVersion(Boolean IsUnknownVersion) {
        this.IsUnknownVersion = IsUnknownVersion;
    }

    /**
     * Get 返回对象用字符串表示 
     * @return Msg 返回对象用字符串表示
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 返回对象用字符串表示
     * @param Msg 返回对象用字符串表示
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackUpJobDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackUpJobDetailResponse(DescribeBackUpJobDetailResponse source) {
        if (source.TableContents != null) {
            this.TableContents = new BackupTableContent[source.TableContents.length];
            for (int i = 0; i < source.TableContents.length; i++) {
                this.TableContents[i] = new BackupTableContent(source.TableContents[i]);
            }
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.IsUnknownVersion != null) {
            this.IsUnknownVersion = new Boolean(source.IsUnknownVersion);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableContents.", this.TableContents);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "IsUnknownVersion", this.IsUnknownVersion);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

