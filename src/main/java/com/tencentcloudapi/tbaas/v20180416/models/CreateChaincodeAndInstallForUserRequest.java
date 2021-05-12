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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateChaincodeAndInstallForUserRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：chaincode_mng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：chaincode_create_and_install_for_user
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 区块链网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 合约安装节点名称，可以在通道详情中获取该通道上的节点名称
    */
    @SerializedName("PeerName")
    @Expose
    private String PeerName;

    /**
    * 智能合约名称，格式说明：以小写字母开头，由2-12位数字或小写字母组成
    */
    @SerializedName("ChaincodeName")
    @Expose
    private String ChaincodeName;

    /**
    * 智能合约版本，格式说明：由1-12位数字、小写字母、特殊符号(“.”)组成，如v1.0
    */
    @SerializedName("ChaincodeVersion")
    @Expose
    private String ChaincodeVersion;

    /**
    * 智能合约代码文件类型，支持类型：
1. "go"：.go合约文件
2. "gozip"：go合约工程zip包，要求压缩目录为代码根目录
3. "javazip"：java合约工程zip包，要求压缩目录为代码根目录
4. "nodezip"：nodejs合约工程zip包，要求压缩目录为代码根目录
    */
    @SerializedName("ChaincodeFileType")
    @Expose
    private String ChaincodeFileType;

    /**
    * 合约内容，合约文件或压缩包内容的base64编码，大小要求小于等于5M
    */
    @SerializedName("Chaincode")
    @Expose
    private String Chaincode;

    /**
     * Get 模块名，本接口取值：chaincode_mng 
     * @return Module 模块名，本接口取值：chaincode_mng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：chaincode_mng
     * @param Module 模块名，本接口取值：chaincode_mng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：chaincode_create_and_install_for_user 
     * @return Operation 操作名，本接口取值：chaincode_create_and_install_for_user
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：chaincode_create_and_install_for_user
     * @param Operation 操作名，本接口取值：chaincode_create_and_install_for_user
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 区块链网络ID，可在区块链网络详情或列表中获取 
     * @return ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 区块链网络ID，可在区块链网络详情或列表中获取
     * @param ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称 
     * @return GroupName 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称
     * @param GroupName 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 合约安装节点名称，可以在通道详情中获取该通道上的节点名称 
     * @return PeerName 合约安装节点名称，可以在通道详情中获取该通道上的节点名称
     */
    public String getPeerName() {
        return this.PeerName;
    }

    /**
     * Set 合约安装节点名称，可以在通道详情中获取该通道上的节点名称
     * @param PeerName 合约安装节点名称，可以在通道详情中获取该通道上的节点名称
     */
    public void setPeerName(String PeerName) {
        this.PeerName = PeerName;
    }

    /**
     * Get 智能合约名称，格式说明：以小写字母开头，由2-12位数字或小写字母组成 
     * @return ChaincodeName 智能合约名称，格式说明：以小写字母开头，由2-12位数字或小写字母组成
     */
    public String getChaincodeName() {
        return this.ChaincodeName;
    }

    /**
     * Set 智能合约名称，格式说明：以小写字母开头，由2-12位数字或小写字母组成
     * @param ChaincodeName 智能合约名称，格式说明：以小写字母开头，由2-12位数字或小写字母组成
     */
    public void setChaincodeName(String ChaincodeName) {
        this.ChaincodeName = ChaincodeName;
    }

    /**
     * Get 智能合约版本，格式说明：由1-12位数字、小写字母、特殊符号(“.”)组成，如v1.0 
     * @return ChaincodeVersion 智能合约版本，格式说明：由1-12位数字、小写字母、特殊符号(“.”)组成，如v1.0
     */
    public String getChaincodeVersion() {
        return this.ChaincodeVersion;
    }

    /**
     * Set 智能合约版本，格式说明：由1-12位数字、小写字母、特殊符号(“.”)组成，如v1.0
     * @param ChaincodeVersion 智能合约版本，格式说明：由1-12位数字、小写字母、特殊符号(“.”)组成，如v1.0
     */
    public void setChaincodeVersion(String ChaincodeVersion) {
        this.ChaincodeVersion = ChaincodeVersion;
    }

    /**
     * Get 智能合约代码文件类型，支持类型：
1. "go"：.go合约文件
2. "gozip"：go合约工程zip包，要求压缩目录为代码根目录
3. "javazip"：java合约工程zip包，要求压缩目录为代码根目录
4. "nodezip"：nodejs合约工程zip包，要求压缩目录为代码根目录 
     * @return ChaincodeFileType 智能合约代码文件类型，支持类型：
1. "go"：.go合约文件
2. "gozip"：go合约工程zip包，要求压缩目录为代码根目录
3. "javazip"：java合约工程zip包，要求压缩目录为代码根目录
4. "nodezip"：nodejs合约工程zip包，要求压缩目录为代码根目录
     */
    public String getChaincodeFileType() {
        return this.ChaincodeFileType;
    }

    /**
     * Set 智能合约代码文件类型，支持类型：
1. "go"：.go合约文件
2. "gozip"：go合约工程zip包，要求压缩目录为代码根目录
3. "javazip"：java合约工程zip包，要求压缩目录为代码根目录
4. "nodezip"：nodejs合约工程zip包，要求压缩目录为代码根目录
     * @param ChaincodeFileType 智能合约代码文件类型，支持类型：
1. "go"：.go合约文件
2. "gozip"：go合约工程zip包，要求压缩目录为代码根目录
3. "javazip"：java合约工程zip包，要求压缩目录为代码根目录
4. "nodezip"：nodejs合约工程zip包，要求压缩目录为代码根目录
     */
    public void setChaincodeFileType(String ChaincodeFileType) {
        this.ChaincodeFileType = ChaincodeFileType;
    }

    /**
     * Get 合约内容，合约文件或压缩包内容的base64编码，大小要求小于等于5M 
     * @return Chaincode 合约内容，合约文件或压缩包内容的base64编码，大小要求小于等于5M
     */
    public String getChaincode() {
        return this.Chaincode;
    }

    /**
     * Set 合约内容，合约文件或压缩包内容的base64编码，大小要求小于等于5M
     * @param Chaincode 合约内容，合约文件或压缩包内容的base64编码，大小要求小于等于5M
     */
    public void setChaincode(String Chaincode) {
        this.Chaincode = Chaincode;
    }

    public CreateChaincodeAndInstallForUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChaincodeAndInstallForUserRequest(CreateChaincodeAndInstallForUserRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.PeerName != null) {
            this.PeerName = new String(source.PeerName);
        }
        if (source.ChaincodeName != null) {
            this.ChaincodeName = new String(source.ChaincodeName);
        }
        if (source.ChaincodeVersion != null) {
            this.ChaincodeVersion = new String(source.ChaincodeVersion);
        }
        if (source.ChaincodeFileType != null) {
            this.ChaincodeFileType = new String(source.ChaincodeFileType);
        }
        if (source.Chaincode != null) {
            this.Chaincode = new String(source.Chaincode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "PeerName", this.PeerName);
        this.setParamSimple(map, prefix + "ChaincodeName", this.ChaincodeName);
        this.setParamSimple(map, prefix + "ChaincodeVersion", this.ChaincodeVersion);
        this.setParamSimple(map, prefix + "ChaincodeFileType", this.ChaincodeFileType);
        this.setParamSimple(map, prefix + "Chaincode", this.Chaincode);

    }
}

