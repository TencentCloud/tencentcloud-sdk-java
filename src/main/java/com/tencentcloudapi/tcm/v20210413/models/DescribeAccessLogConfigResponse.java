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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessLogConfigResponse extends AbstractModel{

    /**
    * 访问日志输出路径。默认 /dev/stdout
    */
    @SerializedName("File")
    @Expose
    private String File;

    /**
    * 访问日志的格式。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 访问日志输出编码，可取值为 "TEXT" 或 "JSON"，默认 TEXT"
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * 选中的范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectedRange")
    @Expose
    private SelectedRange SelectedRange;

    /**
    * 采用的模板，可取值为"istio" 或 "trace"，默认为"istio"
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * 腾讯云日志服务相关参数
    */
    @SerializedName("CLS")
    @Expose
    private CLS CLS;

    /**
    * GRPC第三方服务器地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 是否启用GRPC第三方服务器
    */
    @SerializedName("EnableServer")
    @Expose
    private Boolean EnableServer;

    /**
    * 是否启用标准输出
    */
    @SerializedName("EnableStdout")
    @Expose
    private Boolean EnableStdout;

    /**
    * 是否启用访问日志采集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 访问日志输出路径。默认 /dev/stdout 
     * @return File 访问日志输出路径。默认 /dev/stdout
     */
    public String getFile() {
        return this.File;
    }

    /**
     * Set 访问日志输出路径。默认 /dev/stdout
     * @param File 访问日志输出路径。默认 /dev/stdout
     */
    public void setFile(String File) {
        this.File = File;
    }

    /**
     * Get 访问日志的格式。 
     * @return Format 访问日志的格式。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 访问日志的格式。
     * @param Format 访问日志的格式。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 访问日志输出编码，可取值为 "TEXT" 或 "JSON"，默认 TEXT" 
     * @return Encoding 访问日志输出编码，可取值为 "TEXT" 或 "JSON"，默认 TEXT"
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 访问日志输出编码，可取值为 "TEXT" 或 "JSON"，默认 TEXT"
     * @param Encoding 访问日志输出编码，可取值为 "TEXT" 或 "JSON"，默认 TEXT"
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 选中的范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectedRange 选中的范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SelectedRange getSelectedRange() {
        return this.SelectedRange;
    }

    /**
     * Set 选中的范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectedRange 选中的范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectedRange(SelectedRange SelectedRange) {
        this.SelectedRange = SelectedRange;
    }

    /**
     * Get 采用的模板，可取值为"istio" 或 "trace"，默认为"istio" 
     * @return Template 采用的模板，可取值为"istio" 或 "trace"，默认为"istio"
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set 采用的模板，可取值为"istio" 或 "trace"，默认为"istio"
     * @param Template 采用的模板，可取值为"istio" 或 "trace"，默认为"istio"
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get 腾讯云日志服务相关参数 
     * @return CLS 腾讯云日志服务相关参数
     */
    public CLS getCLS() {
        return this.CLS;
    }

    /**
     * Set 腾讯云日志服务相关参数
     * @param CLS 腾讯云日志服务相关参数
     */
    public void setCLS(CLS CLS) {
        this.CLS = CLS;
    }

    /**
     * Get GRPC第三方服务器地址 
     * @return Address GRPC第三方服务器地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set GRPC第三方服务器地址
     * @param Address GRPC第三方服务器地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 是否启用GRPC第三方服务器 
     * @return EnableServer 是否启用GRPC第三方服务器
     */
    public Boolean getEnableServer() {
        return this.EnableServer;
    }

    /**
     * Set 是否启用GRPC第三方服务器
     * @param EnableServer 是否启用GRPC第三方服务器
     */
    public void setEnableServer(Boolean EnableServer) {
        this.EnableServer = EnableServer;
    }

    /**
     * Get 是否启用标准输出 
     * @return EnableStdout 是否启用标准输出
     */
    public Boolean getEnableStdout() {
        return this.EnableStdout;
    }

    /**
     * Set 是否启用标准输出
     * @param EnableStdout 是否启用标准输出
     */
    public void setEnableStdout(Boolean EnableStdout) {
        this.EnableStdout = EnableStdout;
    }

    /**
     * Get 是否启用访问日志采集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 是否启用访问日志采集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用访问日志采集
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 是否启用访问日志采集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
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

    public DescribeAccessLogConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessLogConfigResponse(DescribeAccessLogConfigResponse source) {
        if (source.File != null) {
            this.File = new String(source.File);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.SelectedRange != null) {
            this.SelectedRange = new SelectedRange(source.SelectedRange);
        }
        if (source.Template != null) {
            this.Template = new String(source.Template);
        }
        if (source.CLS != null) {
            this.CLS = new CLS(source.CLS);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.EnableServer != null) {
            this.EnableServer = new Boolean(source.EnableServer);
        }
        if (source.EnableStdout != null) {
            this.EnableStdout = new Boolean(source.EnableStdout);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "File", this.File);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamObj(map, prefix + "SelectedRange.", this.SelectedRange);
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamObj(map, prefix + "CLS.", this.CLS);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "EnableServer", this.EnableServer);
        this.setParamSimple(map, prefix + "EnableStdout", this.EnableStdout);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

