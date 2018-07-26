package com.tencentcloudapi.scf.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetFunctionResponse  extends AbstractModel{


    /**
    * 函数的最后修改时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 函数的代码
    */
    @SerializedName("CodeInfo")
    @Expose
    private String CodeInfo;

    /**
    * 函数的描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 函数的触发器列表
    */
    @SerializedName("Triggers")
    @Expose
    private Trigger [] Triggers;

    /**
    * 函数的入口
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * 函数代码大小
    */
    @SerializedName("CodeSize")
    @Expose
    private Integer CodeSize;

    /**
    * 函数的超时时间
    */
    @SerializedName("Timeout")
    @Expose
    private Integer Timeout;

    /**
    * 函数的版本
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * 函数的最大可用内存
    */
    @SerializedName("MemorySize")
    @Expose
    private Integer MemorySize;

    /**
    * 函数的运行环境
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 函数的名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的私有网络
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * 是否使用GPU
    */
    @SerializedName("UseGpu")
    @Expose
    private String UseGpu;

    /**
    * 函数的环境变量
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * 代码是否正确
    */
    @SerializedName("CodeResult")
    @Expose
    private String CodeResult;

    /**
    * 代码错误信息
    */
    @SerializedName("CodeError")
    @Expose
    private String CodeError;

    /**
    * 代码错误码
    */
    @SerializedName("ErrNo")
    @Expose
    private Integer ErrNo;

    /**
    * 函数的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数绑定的角色
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取函数的最后修改时间
     * @return ModTime 函数的最后修改时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * 设置函数的最后修改时间
     * @param ModTime 函数的最后修改时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * 获取函数的代码
     * @return CodeInfo 函数的代码
     */
    public String getCodeInfo() {
        return this.CodeInfo;
    }

    /**
     * 设置函数的代码
     * @param CodeInfo 函数的代码
     */
    public void setCodeInfo(String CodeInfo) {
        this.CodeInfo = CodeInfo;
    }

    /**
     * 获取函数的描述信息
     * @return Description 函数的描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置函数的描述信息
     * @param Description 函数的描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取函数的触发器列表
     * @return Triggers 函数的触发器列表
     */
    public Trigger [] getTriggers() {
        return this.Triggers;
    }

    /**
     * 设置函数的触发器列表
     * @param Triggers 函数的触发器列表
     */
    public void setTriggers(Trigger [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * 获取函数的入口
     * @return Handler 函数的入口
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * 设置函数的入口
     * @param Handler 函数的入口
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * 获取函数代码大小
     * @return CodeSize 函数代码大小
     */
    public Integer getCodeSize() {
        return this.CodeSize;
    }

    /**
     * 设置函数代码大小
     * @param CodeSize 函数代码大小
     */
    public void setCodeSize(Integer CodeSize) {
        this.CodeSize = CodeSize;
    }

    /**
     * 获取函数的超时时间
     * @return Timeout 函数的超时时间
     */
    public Integer getTimeout() {
        return this.Timeout;
    }

    /**
     * 设置函数的超时时间
     * @param Timeout 函数的超时时间
     */
    public void setTimeout(Integer Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * 获取函数的版本
     * @return FunctionVersion 函数的版本
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * 设置函数的版本
     * @param FunctionVersion 函数的版本
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * 获取函数的最大可用内存
     * @return MemorySize 函数的最大可用内存
     */
    public Integer getMemorySize() {
        return this.MemorySize;
    }

    /**
     * 设置函数的最大可用内存
     * @param MemorySize 函数的最大可用内存
     */
    public void setMemorySize(Integer MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * 获取函数的运行环境
     * @return Runtime 函数的运行环境
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置函数的运行环境
     * @param Runtime 函数的运行环境
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * 获取函数的名称
     * @return FunctionName 函数的名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置函数的名称
     * @param FunctionName 函数的名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取函数的私有网络
     * @return VpcConfig 函数的私有网络
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * 设置函数的私有网络
     * @param VpcConfig 函数的私有网络
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * 获取是否使用GPU
     * @return UseGpu 是否使用GPU
     */
    public String getUseGpu() {
        return this.UseGpu;
    }

    /**
     * 设置是否使用GPU
     * @param UseGpu 是否使用GPU
     */
    public void setUseGpu(String UseGpu) {
        this.UseGpu = UseGpu;
    }

    /**
     * 获取函数的环境变量
     * @return Environment 函数的环境变量
     */
    public Environment getEnvironment() {
        return this.Environment;
    }

    /**
     * 设置函数的环境变量
     * @param Environment 函数的环境变量
     */
    public void setEnvironment(Environment Environment) {
        this.Environment = Environment;
    }

    /**
     * 获取代码是否正确
     * @return CodeResult 代码是否正确
     */
    public String getCodeResult() {
        return this.CodeResult;
    }

    /**
     * 设置代码是否正确
     * @param CodeResult 代码是否正确
     */
    public void setCodeResult(String CodeResult) {
        this.CodeResult = CodeResult;
    }

    /**
     * 获取代码错误信息
     * @return CodeError 代码错误信息
     */
    public String getCodeError() {
        return this.CodeError;
    }

    /**
     * 设置代码错误信息
     * @param CodeError 代码错误信息
     */
    public void setCodeError(String CodeError) {
        this.CodeError = CodeError;
    }

    /**
     * 获取代码错误码
     * @return ErrNo 代码错误码
     */
    public Integer getErrNo() {
        return this.ErrNo;
    }

    /**
     * 设置代码错误码
     * @param ErrNo 代码错误码
     */
    public void setErrNo(Integer ErrNo) {
        this.ErrNo = ErrNo;
    }

    /**
     * 获取函数的命名空间
     * @return Namespace 函数的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置函数的命名空间
     * @param Namespace 函数的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取函数绑定的角色
     * @return Role 函数绑定的角色
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * 设置函数绑定的角色
     * @param Role 函数绑定的角色
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "CodeInfo", this.CodeInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "CodeSize", this.CodeSize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "UseGpu", this.UseGpu);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "CodeResult", this.CodeResult);
        this.setParamSimple(map, prefix + "CodeError", this.CodeError);
        this.setParamSimple(map, prefix + "ErrNo", this.ErrNo);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

