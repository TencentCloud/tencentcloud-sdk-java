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
package com.tencentcloudapi.cloudapp.v20220530.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseData extends AbstractModel {

    /**
    * <p>License 文本内容。支持密钥、证书等文本形式，二进制的密钥需要伙伴进行 base64 转码</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>部署服务输出信息，基于部署签发 License 时需要该参数。</p>
    */
    @SerializedName("DeploymentOutput")
    @Expose
    private String DeploymentOutput;

    /**
    * <p>License 前端展示信息。key、value 形式，比如可传入，颁发机构：XXXX 有限公司</p>
    */
    @SerializedName("Metadata")
    @Expose
    private DisplayMetadata [] Metadata;

    /**
     * Get <p>License 文本内容。支持密钥、证书等文本形式，二进制的密钥需要伙伴进行 base64 转码</p> 
     * @return Text <p>License 文本内容。支持密钥、证书等文本形式，二进制的密钥需要伙伴进行 base64 转码</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>License 文本内容。支持密钥、证书等文本形式，二进制的密钥需要伙伴进行 base64 转码</p>
     * @param Text <p>License 文本内容。支持密钥、证书等文本形式，二进制的密钥需要伙伴进行 base64 转码</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>部署服务输出信息，基于部署签发 License 时需要该参数。</p> 
     * @return DeploymentOutput <p>部署服务输出信息，基于部署签发 License 时需要该参数。</p>
     */
    public String getDeploymentOutput() {
        return this.DeploymentOutput;
    }

    /**
     * Set <p>部署服务输出信息，基于部署签发 License 时需要该参数。</p>
     * @param DeploymentOutput <p>部署服务输出信息，基于部署签发 License 时需要该参数。</p>
     */
    public void setDeploymentOutput(String DeploymentOutput) {
        this.DeploymentOutput = DeploymentOutput;
    }

    /**
     * Get <p>License 前端展示信息。key、value 形式，比如可传入，颁发机构：XXXX 有限公司</p> 
     * @return Metadata <p>License 前端展示信息。key、value 形式，比如可传入，颁发机构：XXXX 有限公司</p>
     */
    public DisplayMetadata [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>License 前端展示信息。key、value 形式，比如可传入，颁发机构：XXXX 有限公司</p>
     * @param Metadata <p>License 前端展示信息。key、value 形式，比如可传入，颁发机构：XXXX 有限公司</p>
     */
    public void setMetadata(DisplayMetadata [] Metadata) {
        this.Metadata = Metadata;
    }

    public LicenseData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseData(LicenseData source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.DeploymentOutput != null) {
            this.DeploymentOutput = new String(source.DeploymentOutput);
        }
        if (source.Metadata != null) {
            this.Metadata = new DisplayMetadata[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new DisplayMetadata(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "DeploymentOutput", this.DeploymentOutput);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

